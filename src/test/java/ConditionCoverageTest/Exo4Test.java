package ConditionCoverageTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.QuadraticEquation;

public class Exo4Test {

    @Test
    void testAZeroConditionTrueFalse() {
        // a == 0 → true
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solve(0, 5, 1);
        });

        // a != 0 → false, already tested in testTwoRealRoots
    }

    @Test
    void testDeltaNegativeConditionTrueFalse() {
        // delta < 0 → true
        double[] roots = QuadraticEquation.solve(1, 0, 1);
        assertNull(roots);

        // delta < 0 → false, tested in testTwoRealRoots and testOneRealRoot
    }

    @Test
    void testDeltaZeroConditionTrueFalse() {
        // delta == 0 → true
        double[] roots = QuadraticEquation.solve(1, 2, 1);
        assertArrayEquals(new double[]{-1.0}, roots);

        // delta == 0 → false, tested in testTwoRealRoots and testNoRealRoots
    }

    @Test
    void testDeltaPositiveCondition() {
        // delta > 0 → true
        double[] roots = QuadraticEquation.solve(1, -3, 2);
        assertArrayEquals(new double[]{2.0, 1.0}, roots);
    }

}
