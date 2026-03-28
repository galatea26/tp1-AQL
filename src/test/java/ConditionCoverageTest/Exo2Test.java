package ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.Anagram;

public class Exo2Test {

    @Test
    void testNullFirstString() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram(null, "abc"); // s1 == null
        });
    }

    @Test
    void testNullSecondString() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram("abc", null); // s2 == null
        });
    }

    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("abc", "abcd")); // s1.length() != s2.length()
    }

    @Test
    void testValidAnagram() {
        assertTrue(Anagram.isAnagram("listen", "silent")); // toutes conditions fausses
    }

    @Test
    void testNotAnagramSameLength() {
        assertFalse(Anagram.isAnagram("abc", "abd")); // condition dans la boucle finale
    }
}