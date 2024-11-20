package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SumIntegerDigitsTest {
	
	static SumIntegerDigits sumIntegerDigits;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		sumIntegerDigits = new SumIntegerDigits();
	}

	@Test
	void testDigitsSum() {
		assertEquals(6, sumIntegerDigits.digitsSum(123));
	}

}
