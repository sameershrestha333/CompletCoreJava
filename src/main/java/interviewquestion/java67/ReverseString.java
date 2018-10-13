package interviewquestion.java67;

public class ReverseString {

	public static void main(String[] args) {
		reverse("sam");
	}

	private static void reverse(String string) {
		StringBuilder builder = new StringBuilder();
		for (int i = string.length() - 1; i >= 0; i--) {
			builder = builder.append(string.charAt(i));
		}
		System.out.println(builder.toString());
	}

}
