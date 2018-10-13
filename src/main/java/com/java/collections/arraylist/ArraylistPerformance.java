package com.java.collections.arraylist;

import java.util.ArrayList;

public class ArraylistPerformance {

	public static void main(String[] args) {
		// Arrays
		String[] strArray = new String[100000];
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = "Name " + i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by array :" + (endTime - startTime) + "ms");

		// Arrays
		startTime = System.currentTimeMillis();
		ArrayList<String> nameList = new ArrayList<>();
		for (int i = 0; i < 100000; i++) {
			nameList.add("Name"+ i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by array List :" + (endTime - startTime) + "ms");
	}

}
