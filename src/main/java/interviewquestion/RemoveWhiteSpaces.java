package interviewquestion;

public class RemoveWhiteSpaces {

	public String removeSpace(String str) {
		return str.replaceAll("\\s", "");
	}

	public String removeSpaceIterativeWay(String str) {
		char[] charArry = str.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < charArry.length; i++) {
			if (charArry[i] != ' ') {
				builder.append(charArry[i]);
			}
		}
		return builder.toString();
	}
}
