package the.introduction.to.algorithms.ii.datastructures.elementarydatastructures.stacksandqueus;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
