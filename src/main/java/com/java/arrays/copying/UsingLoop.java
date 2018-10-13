package com.java.arrays.copying;

public class UsingLoop {

	public static void main(String[] args) {
		int[] a = { 12, 21, 0, 5, 7 }; // Declaring and initializing an array of ints

		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		a[2]= 56;
		System.out.println(b[2]);
	}

}
