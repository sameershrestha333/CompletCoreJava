package codingdojo.tdd.leapyear;

import static org.junit.Assert.*;

import org.junit.*;

public class LeapYearTest {

	@Test
	public void test() {
		assertTrue(LeapYear.isLeap(1996));
	}

	@Test
	public void test_2() {
		assertFalse(LeapYear.isLeap(2001));
	}
	bo
	@Test
	public void test_3() {
		assertTrue(LeapYear.isLeap(2000));
	}
	
	@Test
	public void test_4() {
		assertFalse(LeapYear.isLeap(1900));
	}
}
