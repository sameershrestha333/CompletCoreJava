package cracking_coding_interview.datastructure.arryasAndStrings;

/**
 * Write a method to replace all spaces in a string with '%20'.
 * 
 * @author sameer
 *
 */
public class URLify_1_3 {

	public static void main(String[] args) {
		url("Mr John Smith ", 13);
	}

	public static String url(String string, int length) {
		char[] arrays = string.toCharArray();
		StringBuilder builder = new StringBuilder(length);
		
		for (int i = 0; i < length; i++) {
			if (arrays[i] == ' ') {
				builder.append("%20");
			} else {
				builder.append(arrays[i]);
			}
		}
		
		return builder.toString();
	}

}
