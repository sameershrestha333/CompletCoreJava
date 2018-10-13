package com.java.arrays.ArraysClass;

import java.util.Arrays;

public class BinarySearchDemo {
	public static void main(String[] args) {
		int[] i = { 24, 13, 45, 37, 84, 13, 28 };
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.binarySearch(i, 370));
	}
}
