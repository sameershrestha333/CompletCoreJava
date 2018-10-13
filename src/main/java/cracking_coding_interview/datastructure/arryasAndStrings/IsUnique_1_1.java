package cracking_coding_interview.datastructure.arryasAndStrings;

public class IsUnique_1_1 {

	public static void main(String[] args) {
		System.out.println(isUniqueChar("Sameer"));
	}

	private static boolean isUniqueChar(String str) {
		if (str.length() > 128)
			return false;

		int[] char_set = new int[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val] != 0) {// Already found this char in string
				return false;
			}
			char_set[val] = 1;
		}
		return true;
	}

	private static boolean isUniqueChars(String str) {
		if (str.length() > 128)
			return false;

		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			System.out.println(val);
			System.out.println(char_set[val]);
			if (char_set[val]) {// Already found this char in string
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	private static boolean isUnique(String string) {
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);

			for (int j = i + 1; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j)) {
					return false;
				}
			}

		}
		return true;
	}

}
