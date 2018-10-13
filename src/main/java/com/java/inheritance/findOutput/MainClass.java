package com.java.inheritance.findOutput;

import java.util.Vector;

class A {
	int i = 10;
}

class B extends A {
	int i = 20;
}

public class MainClass {
	public static void main(String[] args) {
		/*A a = new B();

		System.out.println(a.i);*/
		B b = new A();
		System.out.println(b.i);
	}
}