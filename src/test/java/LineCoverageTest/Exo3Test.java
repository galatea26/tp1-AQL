package LineCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.BinarySearch;

public class Exo3Test {

    @Test
    void testElementFound() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(arr, 5)); // retourne l’indice
    }

    @Test
    void testElementNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(arr, 4)); // retourne -1
    }

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 5);
        });
    }

    @Test
    void testSingleElementFound() {
        int[] arr = {10};
        assertEquals(0, BinarySearch.binarySearch(arr, 10));
    }

    @Test
    void testSingleElementNotFound() {
        int[] arr = {10};
        assertEquals(-1, BinarySearch.binarySearch(arr, 5));
    }
}