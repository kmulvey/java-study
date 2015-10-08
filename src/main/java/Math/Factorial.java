package Math;
import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0].trim());
		BigInteger result = new BigInteger("1");
		while(n>1){
			BigInteger curr = result;
			result = curr.multiply(new BigInteger(Integer.toString(n)));
			n--;
		}
		System.out.println(result.toString());
	}

}
