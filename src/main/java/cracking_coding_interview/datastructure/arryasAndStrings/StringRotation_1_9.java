package cracking_coding_interview.datastructure.arryasAndStrings;

public class StringRotation_1_9 {

	public static boolean isRotation(String str1, String str2) {
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(0)) {
				count++;
			} else
				break;
		}
		String y = str1.substring(count, str1.length());
		String x = str1.substring(0, count);

		if (str2.equals(y + x)) {
			return true;
		}
		return false;
	}
	
	/*boolean isRotation(String sl, String s2) {
		int len = sl.length();
		 Check that sl and s2 are equal length and not empty 
		if (len == s2.length() && len > 0) {
			 Concatenate sl and sl within new buffer 
			String slsl = sl + sl;
			return isSubstring(slsl, s2);
		}
		return false;
	}*/

}
