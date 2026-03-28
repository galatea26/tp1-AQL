package BranchCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.Anagram;

public class Exo2Test {

    @Test
    void testAnagramNormal() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    @Test
    void testNotAnagramDifferentLength() {
        assertFalse(Anagram.isAnagram("chien", "nich"));
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram(null, "abc");
        });
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram("abc", null);
        });
    }

    @Test
    void testNotAnagramSameLengthDifferentLetters() {
        assertFalse(Anagram.isAnagram("abc", "abd"));
    }
}