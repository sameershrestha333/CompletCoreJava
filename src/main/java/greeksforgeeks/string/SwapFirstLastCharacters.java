package greeksforgeeks.string;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Java program to swap first and last characters of words in a sentence
 * 
 * @author sameer
 *
 */

public class SwapFirstLastCharacters {

	public String swap(String input) {
		String[] array = input.split(" ");
		int n;
		String output = "";
		for (String str : array) {
			n = str.length();
			char[] chArray = str.toCharArray();
			char temp = str.charAt(0);
			chArray[0] = chArray[n - 1];
			chArray[n - 1] = temp;
			if (output.isEmpty()) {
				output = new String(chArray);
			} else
				output = output + " " + new String(chArray);
		}

		return output;
	}

}
