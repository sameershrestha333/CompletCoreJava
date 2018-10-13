package codingdojo.tdd.leapyear;

public class LeapYear {

	public static boolean isLeap(int year) {

		if (secondCondition(year) && firstCondition(year)) {
			return true;
		}

		return false;
	}

	private static boolean firstCondition(int year) {
		return year % 100 != 0 || year % 400 == 0;
	}

	private static boolean secondCondition(int year) {
		return year % 4 == 0;
	}
}
