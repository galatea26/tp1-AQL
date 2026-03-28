package ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.RomanNumeral;

public class Exo5Test {

    @Test
    void testThrowsOnNegative() {
        // condition n < 1 vraie
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(-1);
        });
    }

    @Test
    void testThrowsOnZero() {
        // condition n < 1 vraie
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(0);
        });
    }

    @Test
    void testThrowsAboveRange() {
        // condition n > 3999 vraie
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(4000);
        });
    }

    @Test
    void testOne() {
        // conditions n < 1 fausse et n > 3999 fausse, while faux
        assertEquals("I", RomanNumeral.toRoman(1));
    }

    @Test
    void testComplex() {
        // while vrai et faux plusieurs fois selon les symboles
        assertEquals("MCMXCIX", RomanNumeral.toRoman(1999));
    }

    @Test
    void testMax() {
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }
}