package com.java.arrays.checkEquality;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EqualityOfTwoArraysTest {
	int[] arrayOne = { 2, 5, 1, 7, 4 };

	int[] arrayTwo = { 2, 5, 1, 7, 4 };
	private EqualityOfTwoArrays equalityOfTwoArrays;

	@Before
	public void setUp() throws Exception {
		equalityOfTwoArrays = new EqualityOfTwoArrays();
	}

	@Test
	public void testCheckEqualityIterative() {
		assertTrue(equalityOfTwoArrays.checkEqualityIterative(arrayTwo, arrayTwo));
	}
	
	@Test
	public void testCheckEqualityEquals() {
		assertTrue(equalityOfTwoArrays.checkEqualityEqual(arrayTwo, arrayTwo));
	}


}
