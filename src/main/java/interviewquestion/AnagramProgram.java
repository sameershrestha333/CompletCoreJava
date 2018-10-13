package interviewquestion;

import java.util.Arrays;

public class AnagramProgram {

	private static void isAnagram(String string1, String string2) {
		char[] charArr1 = string1.toLowerCase().toCharArray();
		char[] charArr2 = string2.toLowerCase().toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		System.out.println(string1 + " and " + string2 + "::isAnagram :" + Arrays.equals(charArr1, charArr2));
	}

	private static boolean isAnagramIterativeWay(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		} else {
			char[] charArr1 = string1.toLowerCase().toCharArray();
			StringBuilder builder = new StringBuilder(string2.toLowerCase());
			for (char c : charArr1) {
				int index = builder.toString().indexOf(c);
				if (index == -1) {
					return false;
				} else {
					builder.deleteCharAt(index);
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		isAnagram("Mother In Law", "Hitler Woman");

		isAnagram("keEp", "peeK");

		isAnagram("SiLeNt CAT", "LisTen AcT");

		isAnagram("Debit Card", "Bad Credit");

		isAnagram("School MASTER", "The ClassROOM");

		isAnagram("DORMITORY", "Dirty Room");

		isAnagram("ASTRONOMERS", "NO MORE STARS");

		isAnagram("Toss", "Shot");

		isAnagram("joy", "enjoy");

		System.out.println(isAnagramIterativeWay("Mother In Law", "Hitler Woman"));

		System.out.println(isAnagramIterativeWay("keEp", "peeK"));

		System.out.println(isAnagramIterativeWay("SiLeNt CAT", "LisTen AcT"));

		System.out.println(isAnagramIterativeWay("Debit Card", "Bad Credit"));

		System.out.println(isAnagramIterativeWay("School MASTER", "The ClassROOM"));

		System.out.println(isAnagramIterativeWay("DORMITORY", "Dirty Room"));

		System.out.println(isAnagramIterativeWay("ASTRONOMERS", "NO MORE STARS"));

		System.out.println(isAnagramIterativeWay("Toss", "Shot"));

		System.out.println(isAnagramIterativeWay("joy", "enjoy"));

	}

}
