package ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.BinarySearch;

public class Exo3Test {

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 1); // array == null true
        });
    }

    @Test
    void testWhileTrueThenFalse() {
        int[] arr = {1, 3, 5};
        assertEquals(2, BinarySearch.binarySearch(arr, 5)); // while true puis false
    }

    @Test
    void testIfTrue() {
        int[] arr = {1, 2, 3};
        assertEquals(1, BinarySearch.binarySearch(arr, 2)); // array[mid] == element
    }

    @Test
    void testElseIfTrue() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(3, BinarySearch.binarySearch(arr, 4)); // array[mid] <= element
    }

    @Test
    void testElseTrue() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(0, BinarySearch.binarySearch(arr, 1)); // else
    }

    @Test
    void testElementNotFound() {
        int[] arr = {1, 2, 3};
        assertEquals(-1, BinarySearch.binarySearch(arr, 5)); // boucle termine sans trouver
    }
}