package algorithms.math.factorial;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.math.BigInteger;

/**
 * This class' implement method computes the factorial of n using iteration.
 */
public class FactorialIterative extends FactorialBase {

    /**
     * Constructs factorial algorithm using iteration.
     */
    public FactorialIterative() {
        super("Factorial Iterative");
    }

    /**
     * Computes the factorial of n using iteration.
     *
     * @param n an argument for the algorithm
     * @return the factorial of n
     */
    @Override
    public BigInteger implement(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments num) {
        return super.runAndTime(this, num);
    }
}
