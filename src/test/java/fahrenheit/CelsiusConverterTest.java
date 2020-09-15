package fahrenheit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CelsiusConverterTest {

    CelsiusConverter conv;

    @BeforeEach
    void setup() {
        conv = new CelsiusConverter();
    }

    @Test
    public void testConverterMustNotBeNull() {
        assertNotNull(conv);
    }

    @Test
    public void testConvertMinus50CToF() {
        double result = conv.convert(-50);

        assertEquals(-58.00000, result, 0.001);
    }

    @Test
    public void testConvertMinus40CToF() {
        double result = conv.convert(-40);

        assertEquals(-40, result, 0.001);
    }

    @Test
    public void testConvertMinus1CToF() {
        double result = conv.convert(-1);

        assertEquals(30.20000, result, 0.001);
    }

    @Test
    public void testConvertZeroCToF() {
        double result = conv.convert(0);

        assertEquals(32.00000, result, 0.001);
    }

    @Test
    public void testConvertPlus1CToF() {
        double result = conv.convert(1);

        assertEquals(33.80000, result, 0.001);
    }

    @Test
    public void testConvertPlus40CToF() {
        double result = conv.convert(40);

        assertEquals(104.0000, result, 0.001);
    }

    @Test
    public void testConvertPlus400CToF() {
        double result = conv.convert(400);

        assertEquals(752.0000, result, 0.001);
    }
}
