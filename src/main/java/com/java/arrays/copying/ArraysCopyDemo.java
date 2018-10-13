package com.java.arrays.copying;

public class ArraysCopyDemo {

	public static void main(String[] args) {
		int[] a = { 12, 21, 0, 5, 7 }; // Declaring and initializing an array of ints
		int[] b = a;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		a[2] = 56;
		System.out.println(b[2]);
	}

}
