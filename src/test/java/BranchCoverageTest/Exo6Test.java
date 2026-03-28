package BranchCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.FizzBuzz;

public class Exo6Test {

    @Test
    void testThrowsOnZero() {
        // branche n <= 0 vraie
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(0);
        });
    }

    @Test
    void testFizzBuzz() {
        // branche n % 15 == 0 vraie
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void testFizz() {
        // branche n % 15 != 0, n % 3 == 0 vraie
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    void testBuzz() {
        // branche n % 3 != 0, n % 5 == 0 vraie
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    void testNumber() {
        // toutes les branches fausses → return String.valueOf
        assertEquals("2", FizzBuzz.fizzBuzz(2));
    }
}