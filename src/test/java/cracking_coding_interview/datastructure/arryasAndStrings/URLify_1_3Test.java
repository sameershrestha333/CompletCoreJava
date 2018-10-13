package cracking_coding_interview.datastructure.arryasAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class URLify_1_3Test {

	@Test
	public void testUrl() {
		assertEquals("Mr%20John%20Smith", URLify_1_3.url("Mr John Smith ", 13));
	}

}
