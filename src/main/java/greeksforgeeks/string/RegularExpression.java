package greeksforgeeks.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		System.out.println(isDigit("10.5"));
		System.out.println(isDigit("10"));

		System.out.println(isDigit("10u.5"));

	}

	private static boolean isDigit(String string) {

		boolean result = false;
		String regex = "[+-]?[0-9]+(\\.[0-9]*)?";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		System.out.println(string + ":::");
		if (matcher.find() && matcher.group().equals(string)) {
			result = true;
		}
		return result;
	}

}
