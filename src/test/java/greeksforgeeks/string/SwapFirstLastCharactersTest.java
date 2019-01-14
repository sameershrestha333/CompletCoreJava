package greeksforgeeks.string;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SwapFirstLastCharactersTest {

	private SwapFirstLastCharacters swapFirstLastCharacters;

	@Before
	public void setUp() throws Exception {
		swapFirstLastCharacters = new SwapFirstLastCharacters();
	}

	@Test
	public void test() {
		assertEquals("seekg rof seekg", swapFirstLastCharacters.swap("geeks for geeks"));
	}

}
