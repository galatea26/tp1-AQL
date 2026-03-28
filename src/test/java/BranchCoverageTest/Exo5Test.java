package BranchCoverageTest;

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
    void testSingleSymbol() {
        // while faux dès le début (n < values[i] directement)
        assertEquals("I", RomanNumeral.toRoman(1));
    }

    @Test
    void testMultiSymbol() {
        // while vrai plusieurs fois sur plusieurs symboles
        assertEquals("XIV", RomanNumeral.toRoman(14));
    }

    @Test
    void testMax() {
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }
}