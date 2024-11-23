package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class SumIntegerDigitsTest {
	
	@Test
	void testDigitsSum() {
		assertEquals(6, SumIntegerDigits.digitsSum(123));
        assertEquals(15, SumIntegerDigits.digitsSum(555));
        assertEquals(0, SumIntegerDigits.digitsSum(0)); // Caso particolare: 0
        assertEquals(1, SumIntegerDigits.digitsSum(100));
        assertEquals(10, SumIntegerDigits.digitsSum(1234));
	}
	
	@Test
    void testGetValidInteger() {
        // Caso valido
        Scanner validInput = new Scanner("42\n");
        assertEquals(42, SumIntegerDigits.getValidInteger(validInput, "Inserisci un numero:"));

        // Caso di input non valido seguito da input valido
        Scanner invalidThenValidInput = new Scanner("abc\n-10\n99\n");
        assertEquals(99, SumIntegerDigits.getValidInteger(invalidThenValidInput, "Inserisci un numero:"));

        // Caso limite di input 1
        Scanner edgeCaseInput = new Scanner("1\n");
        assertEquals(1, SumIntegerDigits.getValidInteger(edgeCaseInput, "Inserisci un numero:"));
    }

}
