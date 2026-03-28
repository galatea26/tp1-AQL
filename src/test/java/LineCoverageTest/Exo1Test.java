package LineCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.Palindrome;

public class Exo1Test {

    @Test
    void testPalindromeSimple() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    @Test
    void testPalindromePhrase() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("bonjour"));
    }

    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindrome(null);
        });
    }

    @Test
    void testCaseInsensitivePalindrome() {
        assertTrue(Palindrome.isPalindrome("Radar"));
    }
    @Test
    void testMixedCasePalindrome() {
        assertTrue(Palindrome.isPalindrome("RaDaR"));
    }

    @Test
    void testCaseInsensitiveNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("Hello"));
    }
    @Test
    void testMixedSymbolPalindrome() {
        assertTrue(Palindrome.isPalindrome("abc?cba"));
    }
}

