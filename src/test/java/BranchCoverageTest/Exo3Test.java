package BranchCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.BinarySearch;

public class Exo3Test {

    @Test
    void testElementEqualsMid() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.binarySearch(arr, 3)); // if(array[mid] == element)
    }

    @Test
    void testElementGreaterThanMid() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(4, BinarySearch.binarySearch(arr, 5)); // else if(array[mid] <= element)
    }

    @Test
    void testElementLessThanMid() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, BinarySearch.binarySearch(arr, 1)); // else branch
    }

    @Test
    void testElementNotInArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, BinarySearch.binarySearch(arr, 6)); // while loop exits
    }
}