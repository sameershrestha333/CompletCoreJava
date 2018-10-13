package com.java.arrays.algorithm;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Java Program To Find Duplicate Elements In An Array
 * @author sameer
 *
 */

public class FindDuplicatesInArray {

	// 1) Using Brute Force Method :
	private static void findDupliateUsingDoubleLoop(String[] strArray) {

		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					System.out.println("Duplicate Element is :" + strArray[i]);
				}
			}
		}
	}

	// 2) Using HashSet :
	private static void findDupliateUsingHashSet(String[] strArray) {
		HashSet<String> set = new HashSet<>();

		for (String str : strArray) {

			/*
			 * if (set.add(name) == false) { // your duplicate element }
			 */

			if (!set.add(str)) {
				System.out.println("Duplicate Element is :" + str);
			}
		}

	}

	// 3) Using HashMap :
	private static void findDupliateUsingHashMap(String[] strArray) {
		Hashtable<String, Integer> map = new Hashtable<>();

		for (String str : strArray) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		// Print duplicate elements from array in Java
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Element is :" + entry.getKey());

			}
		}

	}

	public static void main(String[] args) {
		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def" };
		findDupliateUsingHashMap(strArray);

	}

}
