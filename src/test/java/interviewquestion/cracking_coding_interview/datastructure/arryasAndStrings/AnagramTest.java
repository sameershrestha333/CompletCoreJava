package interviewquestion.cracking_coding_interview.datastructure.arryasAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void testIsPernutationTrue() {
		assertTrue(Anagram.isAnagram("abc", "cba"));
		assertTrue(Anagram.isAnagram("geeksforgeeks", "forgeeksgeeks"));
		assertTrue(Anagram.isAnagram("anagram", "margana"));
	}

	@Test
	public void testIsPernutationFalse() {
		assertFalse(Anagram.isAnagram("abc", "caa"));
		assertFalse(Anagram.isAnagram("anagramm", "marganaa"));
	}

}
