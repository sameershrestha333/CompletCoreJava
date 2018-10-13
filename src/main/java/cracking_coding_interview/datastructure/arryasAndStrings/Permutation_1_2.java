package cracking_coding_interview.datastructure.arryasAndStrings;

import java.util.Arrays;

public class Permutation_1_2 {

	public static void main(String[] args) {
		System.out.println(isPermutation("abc", "cba"));
		System.out.println(isPermutation("abc", "cca"));
		System.out.println(isPermutation("geeksforgeeks", "forgeeksgeeks"));
	}

	public static boolean isPermutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);

			if (str2.indexOf(ch) == -1) 
				return false;
			else 
				str2 = str2.replaceFirst(String.valueOf(ch), " ");
		}

		return true;
	}

	public static boolean isPermutationV1(String str1, String str2) {
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}

}
