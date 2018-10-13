package the.introduction.to.algorithms.ii.datastructures.elementarydatastructures.stacksandqueus;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

public class MyStackTest {

	MyStack stack = new MyStack();

	@Test
	public void Stack_Empty() {
		assertTrue(stack.STACK_EMPTY());
	}

	@Test
	public void push() {
		stack.push(4);
		assertFalse(stack.STACK_EMPTY());
	}

	@Test
	public void popI() {
		stack.push(4);
		int popData = stack.pop();
		assertEquals(4, popData);
	}

	@Test
	public void pop() {
		stack.push(3);
		stack.push(4);

		int popData = stack.pop();
		assertEquals(4, popData);
	}

	@Test
	public void pop_SecondCase() {
		stack.push(4);
		stack.push(5);

		int popData = stack.pop();
		assertEquals(5, popData);
	}

	@Test
	public void pop_ThirdCase() {
		stack.push(4);
		stack.push(5);
		assertFalse(stack.STACK_EMPTY());
	}

	@Test
	public void push_Size() {
		stack.push(4);
		stack.push(5);
		stack.push(6);
		assertFalse(stack.STACK_EMPTY());
	}

	@Test(expected = EmptyStackException.class)
	public void popExecption() {
		stack.pop();
	}
}
