package com.java.enumdemo;

class ClassContainingEnum {
	enum enums {
		A, B, C
	}
}

public class MainClass {
	public static void main(String[] args) {
		System.out.println(ClassContainingEnum.enums.A); // Accessing enums directly using class name
	}
}