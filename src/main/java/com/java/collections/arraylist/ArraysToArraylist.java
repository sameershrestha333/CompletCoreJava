package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Convert Array to ArrayList
 * 
 * @author sameer
 *
 */
public class ArraysToArraylist {

	public static void main(String[] args) {
		String[] strArray = { "Apple", "Banana", "Orange" };
		List<String> strArr = Arrays.asList(strArray);
		ArrayList<String> strArr1 = new ArrayList<>(strArr);
		// Arrays.stream(strArray).bo
		int[] array = { 2, 4, 5 };

		//List<Integer> list1 = Arrays.asList(array);
			
		List<Integer> collect = Arrays.stream(array).boxed().collect(Collectors.toList());
		
		List<Integer> list = Arrays

				.stream(array)

				.boxed()

				.collect(Collectors.toList());
	}
}
