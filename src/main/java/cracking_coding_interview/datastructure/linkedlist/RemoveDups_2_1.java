package cracking_coding_interview.datastructure.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class RemoveDups_2_1 {

	public static void main(String[] args) {

	}

	public static List<Integer> removeDups(List<Integer> listWithDuplicates) {
		List<Integer> listWithoutDups = new LinkedList<>();

		listWithDuplicates.forEach(e -> {
			if (listWithoutDups.indexOf(e) == -1) {
				listWithoutDups.add(e);
			}
		});
		return listWithoutDups;
	}

}
