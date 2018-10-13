package com.java.string.coding;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class LargestNumberTest {

	private LargestNumber largestNumber;
	private int number;
	private int digit;
	private int expected;

	public LargestNumberTest(int number, int digit, int expected) {
		this.number = number;
		this.digit = digit;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(
				new Object[][] { { 123, 2, 119 }, { 4582, 5, 4499 }, { 98512, 5, 98499 }, { 548624, 8, 547999 },{ 145, 4, 139 } });
	}

	@Before
	public void setUp() throws Exception {
		largestNumber = new LargestNumber();
	}

	@Test
	public void testFindLargest() {
		assertEquals(expected, largestNumber.findLargest(number, digit));
	}

}
