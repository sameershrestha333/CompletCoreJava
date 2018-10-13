package cracking_coding_interview.datastructure.arryasAndStrings;

import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Palindrome_Permutation_1_4 {

	public static void main(String[] args) {
		System.out.println(checkPalindromePermutation("taco cat"));
	}

	public static boolean checkPalindromePermutation(String string) {
		Map<Character, Integer> map = new HashMap<>();

		char[] arrays = string.toCharArray();
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		for (char c : arrays) {
			int cValue = Character.getNumericValue(c);
			if (cValue >= a && cValue <= z) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}

		}

		Set<Character> set = map.keySet();
		for (Character character : set) {
			if ((map.get(character) % 2) != 0)
				if (map.get(character) != 1) {
					return false;
				}
		}

		return true;
	}

}
