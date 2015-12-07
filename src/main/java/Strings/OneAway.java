package Strings;

public class OneAway {
	public boolean compare(String a, String b) {
		if (a.equals(b)) return true;
		int lengthDiff = a.length() - b.length();
		if (Math.abs(lengthDiff) > 1) return false;
		else if (lengthDiff == 0) {
			return editReplace(a, b);
		} else if (lengthDiff == 1) {
			return editInsert(b, a);
		} else if (lengthDiff == -1) {
			return editInsert(a, b);
		}
		return false;
	}

	private boolean editReplace(String a, String b) {
		int numDiff = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) numDiff++;
			if (numDiff > 1) return false;
		}
		return true;
	}

	private boolean editInsert(String a, String b) {
		int indexA = 0, indexB = 0;

		while (indexA < a.length() && indexB < b.length()) {
			if (a.charAt(indexA) != b.charAt(indexB)) {
				if (indexA != indexB) {
					return false;
				} else {
					indexB++;
				}
			} else {
				indexA++;
				indexB++;
			}
		}

		return true;
	}
}