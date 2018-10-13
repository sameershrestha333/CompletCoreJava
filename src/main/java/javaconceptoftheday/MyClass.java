package javaconceptoftheday;

public class MyClass {

	public static void getValue(int arr[], int num) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
			int temp = value;
			builder.append(value).append(" ");
			for (int j = i + 1; j < arr.length; j++) {
				if (temp + arr[j] == num) {
					builder.append(arr[j]);
					System.out.println(builder);
					break;
				} else if (temp + arr[j] < num) {
					temp = temp + arr[j];
					builder.append(arr[j]).append(" ");
				} else {
					builder.setLength(0);
					break;
				}
			}
		}
	}

	public static void main(String args[]) {
		int[] arr = new int[] { 12, 5, 31, 9, 21, 8 };
		getValue(arr, 45);
	}
}