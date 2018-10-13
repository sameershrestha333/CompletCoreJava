package interviewquestion.cracking_coding_interview.datastructure.arryasAndStrings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("abc", "cba"));
		System.out.println(isAnagram("abc", "cca"));
		System.out.println(isAnagram("geeksforgeeks", "forgeeksgeeks"));
	}

	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.toLowerCase().charAt(i);

			if (str2.toLowerCase().indexOf(ch) == -1)
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
