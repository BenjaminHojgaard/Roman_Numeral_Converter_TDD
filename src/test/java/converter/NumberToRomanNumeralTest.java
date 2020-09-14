package converter;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NumberToRomanNumeralTest {

    NumberToRomanNumeralConverter c;

    @BeforeEach
    void setup() {
        c = new NumberToRomanNumeralConverter();
    }

    @Test
    public void testMustBeAbleToCreateConverter() {

        // Assert
        assertNotNull(c);
    }

    @Test
    void testMustConvert1ToRomanI() throws Exception {

        String result = c.convertNumberToRoman(1);

        assertEquals("I", result);
    }

    @Test
    void testMustThrowExceptionIfZero() throws Exception {

        var result = c.convertNumberToRoman(0);

        assertNull(result);

    }

    @Test
    void testMustThrowExceptionIfNegativeValue() {

        Exception thrown = assertThrows(
                Exception.class, () -> c.convertNumberToRoman(-123)
        );
        assertTrue(thrown.getMessage().contains("Values can't be 0 or less"));

    }

    @Test
    void testMustThrowExceptionIf4000OrAbove() {

        Exception thrown = assertThrows(
                Exception.class, () -> c.convertNumberToRoman(4000)
        );
        assertTrue(thrown.getMessage().contains("Values can't be 4000 or above"));

    }

    @Test
    void testMustConvertOnesToIs() throws Exception {

        String result = c.convertNumberToRoman(2);

        assertEquals("II", result);

    }

    @Test
    void testMustConvertTensToXs() throws Exception {

        String result = c.convertNumberToRoman(22);

        assertEquals("XXII", result);

    }

    @Test
    void testMustConvertHundredsToCs() throws Exception {

        String result = c.convertNumberToRoman(222);

        assertEquals("CCXXII", result);

    }

    @Test
    void testMustConvertThousandsToMs() throws Exception {

        String result = c.convertNumberToRoman(2222);

        assertEquals("MMCCXXII", result);

    }

    @Test
    void testMustConvert3999ToMMMCMXCIX() throws Exception {

        String result = c.convertNumberToRoman(3999);

        assertEquals("MMMCMXCIX", result);

    }
}
