package com.java.arrays.arraysAsParameter;

public class ArraysInJava {
	static void methodOne(int[] d)
	{
		d[2] = 11;   //Changing the value of element at index 2

		d[5] = 22;   //Changing the value of element at index 5
	}

	public static void main(String[] args) {
		int[] d = new int[8];
		
		d[2] = 1;
		
		d[5]= 2;
		
		methodOne(d);
		System.out.println(d[2]);
		System.out.println(d[5]);
	}

}
