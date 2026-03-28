package BranchCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.Palindrome;

public class Exo1Test {

    @Test
    void testPalindromeSimple() {
        assertTrue(Palindrome.isPalindrome("kayak")); // while vrai, charAt égal
    }

    @Test
    void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("bonjour")); // charAt différent
    }

    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () ->
                Palindrome.isPalindrome(null)
        ); // if s==null vrai
    }

    @Test
    void testEvenLengthPalindrome() {
        assertTrue(Palindrome.isPalindrome("abba")); // while vrai jusqu’à fin
    }

    @Test
    void testEmptyString() {
        assertTrue(Palindrome.isPalindrome("")); // while faux dès le départ
    }
}