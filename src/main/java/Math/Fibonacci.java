package Math;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0].trim());
		if (n < 3)
			System.out.println(1);

		long n1 = 1;
		long n2 = 1;
		long current = 2;
		for (int i = 3; i <= n; i++) {
			current = n1 + n2;
			n2 = n1;
			n1 = current;
		}
		System.out.println(current);
	}

	private static long fibonacci(int n, Map<Integer, Long> computedValues) {
		if (computedValues.containsKey(n))
			return computedValues.get(n);

		computedValues.put(n - 1, fibonacci(n - 1, computedValues));
		computedValues.put(n - 2, fibonacci(n - 2, computedValues));

		long newValue = computedValues.get(n - 1) + computedValues.get(n - 2);
		computedValues.put(n, newValue);
		return newValue;
	}
}
