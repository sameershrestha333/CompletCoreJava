package cracking_coding_interview.datastructure.arryasAndStrings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Integer arrs[] = { 1, 2, 3, 4, 6 };

		/*List<Integer> asList = Arrays.asList(arrs);
		for (Integer is : asList) {
			if (is % 2 == 0) {

			}
		}*/

		Stream.of(arrs).filter(v -> {
			return v % 2 == 0;
		}).collect(Collectors.toList()).forEach(s->System.out.println(s));

		/*
		 * boolean[] str = new boolean[400]; str[0] = true; str[1] = false;
		 * System.out.println(str[5]);
		 * 
		 * int[] intArrys = new int[400]; intArrys[0] = 1; intArrys[1] = 2;
		 * System.out.println(intArrys[4]);
		 */
	}

}
