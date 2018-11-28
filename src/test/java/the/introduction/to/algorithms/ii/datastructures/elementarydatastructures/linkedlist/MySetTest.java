package the.introduction.to.algorithms.ii.datastructures.elementarydatastructures.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MySetTest {

	private MySet set;

	@Before
	public void setUp() throws Exception {
		set = new MySet();
	}

	@Test
	public void isEmpty() {
		assertTrue(set.isEmpty());
	}

	@Test
	public void isEmptyAndAdd() {
		set.add(5);
		assertEquals(1, set.getSize());
	}
	
	@Test
	public void isEmptyAndAdId() {
		set.add(5);
		assertFalse(set.isEmpty());
	}

	@Test
	public void getSize() {
		set.add(5);
		set.add(6);
		set.add(7);
		assertEquals(3, set.getSize());
	}
	

	@Test
	public void containsItem() {
		set.add(5);
		set.add(6);
		assertTrue(set.contains(5));
	}
	
	@Test
	public void containsItemNegative() {
		set.add(5);
		set.add(6);
		assertFalse(set.contains(7));
	}
	
	@Test
	public void addDuplicates() {
		set.add(5);
		set.add(6);
		set.add(6);
		assertEquals(2, set.getSize());
	}
	
	@Test
	public void addMaxData() {
		set.add(5);
		set.add(6);
		set.add(7);
		assertEquals(3, set.getSize());
	}
	
	@Test
	public void removeData() {
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.remove(6);
		assertEquals(3, set.getSize());
	}
	
	@Test
	public void getIndexOf() {
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		assertEquals(1, set.getIndexOf(6));
	}

}
