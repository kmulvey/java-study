package Math;

public class Swap {
	// lazy to return string rather than an Object, but thats not the point
	public static String addSwap(int first, int second) {
		if (first != second) {
			first = first + second;
			second = first - second;
			first = first - second;
		}

		return Integer.toString(first) + Integer.toString(second);
	}
}
