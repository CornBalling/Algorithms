package algorithms.math.gcd;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

/**
 * This class' implement method finds the Greatest Common Divisor of two integers
 * using recursion.
 */
public class GCDRecursive extends GCDBase {
    /**
     * Constructs recursive GCD algorithm.
     */
    public GCDRecursive() {
        super("Greatest Common Divisor Recursive");
    }

    /**
     * Finds GCD of a and b using subtraction Euclid's algorithm.
     *
     * @param a a positive integer
     * @param b a positive integer
     * @return the GCD of a and b
     */
    @Override
    public int implement(int a, int b) {
        if (b == 0) {
            return a;
        }
        return implement(b, a % b);
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments aAndB) {
        return super.runAndTime(this, aAndB);
    }
}
