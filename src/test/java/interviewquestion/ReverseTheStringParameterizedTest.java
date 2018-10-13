/**
 * 
 */
package interviewquestion;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author sameer
 *
 */
@RunWith(value = Parameterized.class)
public class ReverseTheStringParameterizedTest {

	private ReverseTheString reverseTheString;

	private String input;
	private String expected;

	public ReverseTheStringParameterizedTest(String input, String expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { "sam", "mas" }, { "ra", "ar" }, { "pas", "sap" } });
	}

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
		assertEquals(expected, reverseTheString.reverse(input));
	}

}
