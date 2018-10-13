package interviewquestion.java67;

public class SwapTwoNum {

	public static void main(String[] args) {
		swap();
	}

	private static void swap() {
		int a = 5;
		int b = 6;
		System.out.println("Before Swaping: a = " + a + " and b= " + b);
		// swapping value of two numbers without using temp variable and XOR bitwise operator
		a = a ^ b; // now a is 3 and b is 6
		b = a ^ b; // now a is 3 but b is 5 (original value of a)
		a = a ^ b; // now a is 6 and b is 5, numbers are swapped
		System.out.println("After  Swaping: a = " + a + " and b= " + b);

	}

}
