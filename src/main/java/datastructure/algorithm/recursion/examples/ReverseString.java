package datastructure.algorithm.recursion.examples;

import java.util.ArrayList;
import java.util.List;


public class ReverseString {

	List<Integer> listss = new ArrayList<>();

	
	public static void main(String[] args) {
		System.out.println(reverseStringIteratively("sameer"));
		System.out.println(reverseStringRecursively("sameer"));
		System.out.println(reverse("samer"));
	}

	private static String reverseStringRecursively(String string) {
		if (string.length() == 0)
			return "";

		return string.charAt(string.length() - 1) + reverseStringIteratively(string.substring(0, string.length() - 1));
	}

	private static String reverseStringIteratively(String string) {
		StringBuilder builder = new StringBuilder();
		for (int i = string.length() - 1; i >= 0; i--) {
			builder.append(string.charAt(i));
		}
		return builder.toString();
	}
	

	private static String reverse(String str) {
		int n = str.length();
		char[] charString = str.toCharArray();
		for (int i = 0; i < n / 2; i++) {
			char ch = charString[i];
			charString[i] = charString[n - 1 - i];
			charString[n - 1 - i] = ch;
		}

		return new String(charString);
	}

}
