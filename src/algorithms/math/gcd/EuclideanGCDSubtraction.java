package algorithms.math.gcd;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

/**
 * This class' implement method finds the Greatest Common Divisor of two integers
 * using Euclid's subtraction algorithm.
 */
public class EuclideanGCDSubtraction extends GCDBase {
    /**
     * Constructs Euclid GCD subtraction algorithm.
     */
    public EuclideanGCDSubtraction() {
        super("Euclidean Greatest Common Divisor Subtraction");
    }

    /**
     * Finds GCD of a and b using Euclid's subtraction algorithm.
     *
     * @param a a positive integer
     * @param b a positive integer
     * @return the GCD of a and b
     */
    @Override
    public int implement(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments aAndB) {
        return super.runAndTime(this, aAndB);
    }
}
