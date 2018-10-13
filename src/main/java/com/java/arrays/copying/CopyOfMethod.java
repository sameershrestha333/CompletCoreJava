package com.java.arrays.copying;

import java.util.Arrays;

public class CopyOfMethod {

	public static void main(String[] args) {
		int[] a = { 12, 21, 0, 5, 7 }; // Declaring and initializing an array of ints
		int [] b = Arrays.copyOf(a, a.length);
		
		a[2] =10;
		System.out.println(a[2]);

		System.out.println(b[2]);
		
	}

}
