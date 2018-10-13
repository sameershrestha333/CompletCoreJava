package com.java.string.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		duplicateCharCount("JavaJ2EE");

		duplicateCharCount("Fresh Fish");

		duplicateCharCount("Better Butter");
	}

	private static void duplicateCharCount(String string) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		char[] charArray = string.replaceAll("\\s", "").toCharArray();

		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		// Getting a Set containing all keys of charCountMap
		Set<Character> charsInString = charCountMap.keySet();
		System.out.println("**** Duplicate value in : " + string);
		for (Character ch : charsInString) {
			if (charCountMap.get(ch) > 1) {
				System.out.println(ch + " : " + charCountMap.get(ch));
			}
		}
	}

}
