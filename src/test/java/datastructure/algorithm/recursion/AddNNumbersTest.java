package datastructure.algorithm.recursion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AddNNumbersTest {

	private AddNNumbers addNNumbers;

	@Before
	public void setUp() throws Exception {
		addNNumbers = new AddNNumbers();
	}

	@Test
	public void testFindTotalIteratively() {
		assertEquals(6, addNNumbers.findTotalIteratively(3));
	}

	@Test
	public void testFindTotalRecursively() {
		assertEquals(6, addNNumbers.findTotalRecursively(3));
	}

}
