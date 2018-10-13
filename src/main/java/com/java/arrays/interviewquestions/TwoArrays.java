package com.java.arrays.interviewquestions;

public class TwoArrays {

	public static void main(String[] args) {
		int[] a = new int[100];

		int[] b = new int[10];

		b = a; //Compiler checks only type, not the size
		
		int[] c = new int[100];

		double[] d = new double[10];

		c = d; //Compiler checks only type, not the size
	} 

}
