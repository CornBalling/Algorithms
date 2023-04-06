package algorithms.math.factorial;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.math.BigInteger;

/**
 * This class' implement method computes the factorial of n using recursion.
 */
public class FactorialRecursive extends FactorialBase {

    /**
     * Constructs factorial algorithm using recursion.
     */
    public FactorialRecursive() {
        super("Factorial Recursive");
    }

    /**
     * Computes factorial of n using recursion.
     *
     * @param n an argument for the algorithm
     * @return factorial of n
     */
    @Override
    public BigInteger implement(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        BigInteger bigN = BigInteger.valueOf(n);
        return bigN.multiply(implement(n - 1));
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments num) {
        return super.runAndTime(this, num);
    }
}
