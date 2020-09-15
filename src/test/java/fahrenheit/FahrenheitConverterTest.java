package fahrenheit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class FahrenheitConverterTest {
    FahrenheitConverter conv;

    @BeforeEach
    void setup() {
        conv = new FahrenheitConverter();
    }

    @Test
    public void testConverterMustNotBeNull() {
        assertNotNull(conv);
    }

    @Test
    public void testConvertMinus50FToC() {
        double result = conv.convert(-50);

        assertEquals(-45.5556, result, 0.001);
    }

    @Test
    public void testConvertMinus40ToC() {
        double result = conv.convert(-40);

        assertEquals(-40, result, 0.001);
    }

    @Test
    public void testConvertMinus1FToC() {
        double result = conv.convert(-1);

        assertEquals(-18.33333, result, 0.001);
    }

    @Test
    public void testConvertZeroFToC() {
        double result = conv.convert(0);

        assertEquals(-17.77778, result, 0.001);
    }

    @Test
    public void testConvertPlus1FToC() {
        double result = conv.convert(1);

        assertEquals(-17.22222, result, 0.001);
    }

    @Test
    public void testConvertPlus40FToC() {
        double result = conv.convert(40);

        assertEquals(4.444444, result, 0.001);
    }

    @Test
    public void testConvertPlus400FToC() {
        double result = conv.convert(400);

        assertEquals(204.4444, result, 0.001);
    }

}
