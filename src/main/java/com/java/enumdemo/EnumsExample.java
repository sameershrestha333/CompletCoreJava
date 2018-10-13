package com.java.enumdemo;

enum enums {
	A, B, C;
}

public class EnumsExample {
	public static void main(String[] args) {
		enums en = enums.A; // accessing constant A through enum name
		
		enums en1 = enums.B; // accessing constant B through enum name

		enums en2 = enums.C; // accessing constant C through enum name
	}
}