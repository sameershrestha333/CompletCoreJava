package com.java.arrays.algorithm;

import java.util.Arrays;

// JAVA Code for Find Second largest
public class SecondLargest {

	public static void main(String[] args) {
		System.out.println(print2Largest(new int[] { 45, 51, 28, 75, 49, 42 }));

		System.out.println(print2Largest(new int[] { 985, 521, 975, 831, 479, 861 }));

		System.out.println(print2Largest(new int[] { 9459, 9575, 5692, 1305, 1942, 9012 }));

		System.out.println(print2Largest(new int[] { 47498, 14526, 74562, 42681, 75283, 45796 }));
	}

	// Using sort() of Arrays class with O(nlogn) - quicksort
	private static int secondLargestUsingSorting(int[] is) {
		Arrays.sort(is);

		return is[is.length - 2];
	}

	// Using O(n) of Arrays class with O(nlogn) - quicksort
	private static int print2Largest(int[] is) {
		int firstLargest, secondLargest;
		if (is[0] > is[1]) {
			firstLargest = is[0];
			secondLargest = is[1];
		} else {
			firstLargest = is[1];
			secondLargest = is[0];
		}

		for (int i = 2; i < is.length; i++) {
			if (is[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = is[i];
			} else if (is[i] < firstLargest && is[i] > secondLargest) {
				secondLargest = is[i];
			}
		}

		return secondLargest;
	}

}
