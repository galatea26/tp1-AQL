package LineCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.RomanNumeral;

public class Exo5Test {

    @Test
    void testThrowsBelowRange() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(0);
        });
    }

    @Test
    void testThrowsAboveRange() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(4000);
        });
    }

    @Test
    void testValidNumber() {
        assertEquals("III", RomanNumeral.toRoman(3));
    }
}