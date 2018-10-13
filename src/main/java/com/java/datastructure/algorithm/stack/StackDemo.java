package com.java.datastructure.algorithm.stack;


public class StackDemo {

	public static void main(String[] args) {
		CustomStack stack = new CustomStack();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.search(4));
	}

}
