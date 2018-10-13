package com.java.arrays.copying;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		int[] a = { 12, 21, 0, 5, 7 }; // Declaring and initializing an array of ints
		int[] b = new int[a.length];

		System.arraycopy(a, 0, b, 0, a.length);

	}

}
