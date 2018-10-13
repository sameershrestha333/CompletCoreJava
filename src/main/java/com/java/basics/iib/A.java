package com.java.basics.iib;

class A {
	int i;

	{
		i = 10;
	}

	A(int j) {
		i = j;
	}
}

class MainClass {
	public static void main(String[] args) {
		A a = new A(50);
		System.out.println(a.i);
	}
}