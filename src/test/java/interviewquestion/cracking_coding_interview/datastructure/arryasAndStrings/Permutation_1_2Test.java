package interviewquestion.cracking_coding_interview.datastructure.arryasAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class Permutation_1_2Test {

	@Test
	public void testIsPernutationTrue() {
		assertTrue(Permutation_1_2.isPermutation("abc", "cba"));
		assertTrue(Permutation_1_2.isPermutation("geeksforgeeks", "forgeeksgeeks"));
		assertTrue(Permutation_1_2.isPermutation("anagram", "margana"));
	}

	@Test
	public void testIsPernutationFalse() {
		assertFalse(Permutation_1_2.isPermutation("abc", "caa"));
		assertFalse(Permutation_1_2.isPermutation("anagramm", "marganaa"));
	}

}
