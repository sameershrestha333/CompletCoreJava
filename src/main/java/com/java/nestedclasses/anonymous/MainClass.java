package com.java.nestedclasses.anonymous;

public class MainClass {
	public static void main(String[] args) {
		Math math = new Math() {
			@Override
			public void arthimatic(int a, int b) {
				System.out.println(a + b);
			}
		};
		math.arthimatic(4, 5);
	}
}