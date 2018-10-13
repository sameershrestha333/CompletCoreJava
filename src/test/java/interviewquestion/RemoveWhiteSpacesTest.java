package interviewquestion;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class RemoveWhiteSpacesTest {
	private RemoveWhiteSpaces removeWhiteSpaces;

	private String input;
	private String expected;

	public RemoveWhiteSpacesTest(String input, String expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { "sam ", "sam" }, { "aa ", "aa" }, { "a a", "aa" } });
	}

	@Before
	public void setUp() throws Exception {
		removeWhiteSpaces = new RemoveWhiteSpaces();
	}

	@Test
	public void testRemoveSpace() {
		assertEquals(expected, removeWhiteSpaces.removeSpaceIterativeWay(input));
	}

}
