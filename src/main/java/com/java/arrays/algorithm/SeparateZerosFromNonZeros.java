package com.java.arrays.algorithm;

import java.util.Arrays;

public class SeparateZerosFromNonZeros {

	public static void main(String[] args) {
		moveZerosToFront(new int[] { 12, 0, 7, 0, 8, 0, 3 });

		moveZerosToFront(new int[] { 1, -5, 0, 0, 8, 0, 1 });

		moveZerosToFront(new int[] { 0, 1, 0, 1, -5, 0, 4 });

		moveZerosToFront(new int[] { -4, 1, 0, 0, 2, 21, 4 });
	}

	private static void moveZerosToEnd(int[] is) {
		int counter = 0;
		int length = is.length;
		for (int i = 0; i < length; i++) {
			if (is[i] != 0) {
				is[counter] = is[i];
				counter++;
			}
		}
		// Assigning zero to remaining elements
		while (counter < length) {
			is[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(is));
	}

	private static void moveZerosToFront(int[] is) {
		int length = is.length;
		int counter = length - 1;

		for (int i = length - 1; i >= 0; i--) {
			if (is[i] != 0) {
				is[counter] = is[i];
				counter--;
			}
		}
		// Assigning zero to remaining elements
		while (counter >= 0) {
			is[counter] = 0;
			counter--;
		}
		System.out.println(Arrays.toString(is));
	}

}
