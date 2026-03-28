package ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.Palindrome;

public class Exo1Test {

    @Test
    void testPalindromeTrue() {
        assertTrue(Palindrome.isPalindrome("kayak")); // conditions while vrai / charAt faux
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(Palindrome.isPalindrome("bonjour")); // charAt != vrai
    }

    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () ->
                Palindrome.isPalindrome(null)
        ); // s==null vrai
    }

    @Test
    void testEmptyString() {
        assertTrue(Palindrome.isPalindrome("")); // while faux
    }

    @Test
    void testSingleCharacter() {
        assertTrue(Palindrome.isPalindrome("a")); // while faux
    }
}