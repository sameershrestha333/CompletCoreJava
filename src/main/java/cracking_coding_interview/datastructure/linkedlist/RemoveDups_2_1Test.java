package cracking_coding_interview.datastructure.linkedlist;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RemoveDups_2_1Test {

	List<Integer> listWithDuplicates = Arrays.asList(1, 2, 3, 4, 5, 1, 2);
	List<Integer> listWithoutDuplicates = Arrays.asList(1, 2, 3, 4, 5);

	@Test
	public void test() {
		assertEquals(listWithoutDuplicates, RemoveDups_2_1.removeDups(listWithDuplicates));
	}

}
