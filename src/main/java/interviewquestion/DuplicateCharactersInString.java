package interviewquestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void findDuplicate(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Character> set = map.keySet();
		System.out.println("Duplicate Characters in :" + str);
		for (Character character : set) {
			if (map.get(character) > 1) {
				System.out.println(character + ":" + map.get(character));
			}
		}

	}

	public static void main(String[] args) {

		findDuplicate("JavaJ2EE");

		findDuplicate("Fresh Fish");

		findDuplicate("Better Butter");
	}

}
