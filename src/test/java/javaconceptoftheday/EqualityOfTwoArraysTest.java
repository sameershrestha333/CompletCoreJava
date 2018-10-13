package javaconceptoftheday;

import static org.junit.Assert.*;

import org.junit.Test;

public class EqualityOfTwoArraysTest {
	int[] arrayOne = { 2, 5, 1, 7, 4 };

	int[] arrayTwo = { 2, 5, 1, 7, 4 };

	@Test
	public void test() {
		assertEquals(true, EqualityOfTwoArrays.check(arrayOne, arrayTwo));
	}

}
