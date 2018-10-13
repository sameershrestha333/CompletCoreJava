package interviewquestion.numbersystem;

public class DecimalToHexaDecimal {
	public static void main(String[] args) {
		System.out.println(decimalToHexaDecimal(2000));
	}

	//The following converts decimal to Hexa Decimal with Time Complexity : O(n) Linear Time with out any java inbuilt function
	private static String decimalToHexaDecimal(int N) {
		char hexaDecimals[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		StringBuilder builder = new StringBuilder();
		while (N != 0) {
			int reminder = N % 16;
			builder.append(hexaDecimals[reminder]);
			N = N / 16;
		}
		return builder.reverse().toString();
	}
}
