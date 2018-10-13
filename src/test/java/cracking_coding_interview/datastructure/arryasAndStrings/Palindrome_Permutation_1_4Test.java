package cracking_coding_interview.datastructure.arryasAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class Palindrome_Permutation_1_4Test {

	@Test
	public void testCheckPalindrome() {
		assertTrue(Palindrome_Permutation_1_4.checkPalindromePermutation("taco cat"));
		assertTrue(Palindrome_Permutation_1_4.checkPalindromePermutation("atco cta"));
		assertTrue(Palindrome_Permutation_1_4.checkPalindromePermutation("tactcoapapa"));
	}
	
	@Test
	public void testCheckPalindromeFalse() {
		assertFalse(Palindrome_Permutation_1_4.checkPalindromePermutation("taco aat"));
		assertFalse(Palindrome_Permutation_1_4.checkPalindromePermutation("atco ata"));
	}

}
