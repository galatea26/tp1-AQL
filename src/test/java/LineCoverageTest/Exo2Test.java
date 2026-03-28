package LineCoverageTest;
import TP1.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    void testAnagramSimple() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    @Test
    void testAnagramWithSpaces() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    void testNotAnagram() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }

    @Test
    void testDifferentLength() {
        assertFalse(Anagram.isAnagram("abc", "ab"));
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram(null, "test");
        });
    }
}