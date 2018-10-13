package com.java.execeptionhandling.throwsKey;

public class ExceptionHandling {
	static void methodWithThrows() throws NullPointerException {
		String s = null;
		System.out.println(s.length());
	}

	public static void main(String[] args) {
		try {
			methodWithThrows();
		} catch (NullPointerException e) {
			// System.out.println(&quot;NullPointerException thrown by methodWithThrows()
			// method will be caught here&quot;);
		}
	}

}
