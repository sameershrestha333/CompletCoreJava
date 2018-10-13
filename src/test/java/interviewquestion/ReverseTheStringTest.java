/**
 * 
 */
package interviewquestion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author sameer
 *
 */
public class ReverseTheStringTest {

	private ReverseTheString reverseTheString;
	String input = "sam";

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		reverseTheString = new ReverseTheString();
	}

	/**
	 * Test method for
	 * {@link interviewquestion.ReverseTheString#reverse(java.lang.String)}.
	 */
	@Test
	public void testReverse() {
		assertEquals("mas", reverseTheString.reverse(input));
	}

}
