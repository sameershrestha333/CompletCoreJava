package interviewquestion;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArmstrongNumberTest {
	private ArmstrongNumber armstrongNumber;
	private int input;
	private boolean result;

	public ArmstrongNumberTest(int input, boolean result) {
		this.input = input;
		this.result = result;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(
				new Object[][] { { 153, true }, { 371, true }, { 407, true }, { 9474, true }, { 54748, true } });
	}

	@Before
	public void setUp() throws Exception {
		armstrongNumber = new ArmstrongNumber();
	}

	@Test
	public void testMain() {
		assertEquals(result, armstrongNumber.checkArmstrongNumber(input));
	}

}
