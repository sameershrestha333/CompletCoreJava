package com.java.string.coding;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		String s = "Java is java again java again";

		char c = 'a';
		int count = s.length() - s.replaceAll("a", "").length();
		System.out.println(count);

	}

}
