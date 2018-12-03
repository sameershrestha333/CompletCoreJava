package datastructure.algorithm.recursion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EuclideanAlgorithTest {

	private EuclideanAlgorith euclideanAlgorith;

	@Before
	public void setUp() throws Exception {
		euclideanAlgorith = new EuclideanAlgorith();
	}

	@Test
	public void testGetGcdIteratively() {
		assertEquals(2, euclideanAlgorith.getGCD(4, 6));
	}
	
	@Test
	public void testGetGcdRecursively() {
		assertEquals(2, euclideanAlgorith.getGCDRecursively(4, 6));
	}
	
	@Test
	public void testGetGcdIterativelyII() {
		assertEquals(2, euclideanAlgorith.getGCD(2, 6));
	}


}
