package algorithms.math.factorial;

import algorithms.base.algorithm.Algorithm;
import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.math.BigInteger;

/**
 * Base class for factorial algorithms.
 */
public class FactorialBase extends Algorithm {
    /**
     * Passes name to super constructor.
     *
     * @param name the specific algorithm's name
     */
    protected FactorialBase(String name) {
        super(name);
    }

    /**
     * Does the factorial logic.
     *
     * @param n factorial argument
     * @return n!
     */
    protected BigInteger implement(int n) {
        throw new UnsupportedOperationException();
    }

    /**
     * Runs the implement method in the class that calls it and times it if necessary.
     *
     * @param fact factorial algorithm to implement
     * @param num contains factorial argument
     * @return result containing the factorial of n and time if necessary
     */
    protected AlgorithmResult runAndTime(FactorialBase fact, AlgorithmArguments num) {
        int n = (int) num.getArguments().get(0);
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater than 0.");
        }
        if (num.clock()) {
            long startTime = System.nanoTime();
            BigInteger result = fact.implement(n);
            long endTime = System.nanoTime();
            return new AlgorithmResult(result.toString(), endTime - startTime);
        }
        BigInteger result = fact.implement(n);
        return new AlgorithmResult(result.toString());
    }
}
