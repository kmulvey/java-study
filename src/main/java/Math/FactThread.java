package Math;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FactThread {

	private static final int INPUT = 1000000;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long start = System.nanoTime();
		BigInteger fact2 = factMtExecutor(INPUT, 100);
		long end = System.nanoTime();
		System.out.println(TimeUnit.SECONDS.convert(end - start, TimeUnit.NANOSECONDS) + " seconds for ThreadPoolExecutor");
		System.out.println(fact2.toString().length());
		System.exit(0);
	}

	private static BigInteger factMtExecutor(int input, int numThreads) throws InterruptedException, ExecutionException {
		FactCallable[] workers = new FactCallable[100];
		for (int i = 1; i <= numThreads; i++) {
			int start = i == 1 ? 1 : (input / numThreads * (i - 1)) + 1;
			int end = i == numThreads ? input : input / numThreads * i;
			workers[i - 1] = new FactCallable(start, end);
		}

		ThreadPoolExecutor executor = new ThreadPoolExecutor(numThreads, numThreads, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

		List<Future<BigInteger>> futures = executor.invokeAll(Arrays.asList(workers));
		BigInteger result = BigInteger.valueOf(1L);
		for (Future<BigInteger> future : futures) {
			result = result.multiply(future.get());
		}

		return result;
	}

	private static class FactCallable implements Callable<BigInteger> {
		private final int from;
		private final int to;

		public FactCallable(int from, int to) {
			this.from = from;
			this.to = to;
		}

		// the actual calculation
		public BigInteger call() throws Exception {
			BigInteger result = BigInteger.valueOf(from);
			for (int i = from + 1; i <= to; i++) {
				result = result.multiply(BigInteger.valueOf(i));
			}
			return result;
		}
	}
}