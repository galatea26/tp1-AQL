package BranchCoverageTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TP1.QuadraticEquation;
public class Exo4Test {

    // =========================
    // Branch Coverage Tests
    // =========================

    @Test
    void testTwoRealRoots() {
        // delta > 0, a != 0
        double[] roots = QuadraticEquation.solve(1, -3, 2); // x^2 -3x + 2 = 0
        assertArrayEquals(new double[]{2.0, 1.0}, roots);
    }

    @Test
    void testOneRealRoot() {
        // delta == 0, a != 0
        double[] roots = QuadraticEquation.solve(1, 2, 1); // x^2 + 2x + 1 = 0
        assertArrayEquals(new double[]{-1.0}, roots);
    }

    @Test
    void testNoRealRoots() {
        // delta < 0, a != 0
        double[] roots = QuadraticEquation.solve(1, 0, 1); // x^2 + 1 = 0
        assertNull(roots);
    }

    @Test
    void testZeroCoefficientA() {
        // a == 0 branch
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solve(0, 2, 1);
        });
    }
}