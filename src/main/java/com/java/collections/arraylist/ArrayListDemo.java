package com.java.collections.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("ONE");

		list.add("TWO");

		list.add("THREE");

		System.out.println(list.size()); // Output : 3

		// Inserting some more elements
		list.add("FOUR");

		list.add("FIVE");

		System.out.println(list.size()); // Output : 5

		// Removing an element
		list.remove("TWO");

		System.out.println(list.size()); // Output : 4
	}
}