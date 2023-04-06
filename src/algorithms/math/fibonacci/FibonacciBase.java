package algorithms.math.fibonacci;

import algorithms.base.algorithm.Algorithm;
import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.math.BigInteger;

/**
 * Base class for Fibonacci algorithms.
 */
public class FibonacciBase extends Algorithm {

    /**
     * Passes name to super constructor.
     *
     * @param name the specific algorithm's name
     */
    protected FibonacciBase(String name) {
        super(name);
    }

    /**
     * Does the fibonacci logic.
     *
     * @param num the fibonacci number wanted
     * @return the num'th fibonacci number
     */
    protected BigInteger implement(int num) {
        throw new UnsupportedOperationException();
    }

    /**
     * Runs the implement method in the class that calls it and times it if necessary.
     *
     * @param fib fibonacci algorithm to implement
     * @param num contains fibonacci number wanted
     * @return result containing the num'th fibonacci number and time if necessary
     */
    protected AlgorithmResult runAndTime(FibonacciBase fib, AlgorithmArguments num) {
        int n = (int) num.getArguments().get(0);
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater than 0.");
        }
        if (num.clock()) {
            long startTime = System.nanoTime();
            BigInteger result = fib.implement(n);
            long endTime = System.nanoTime();
            return new AlgorithmResult(result.toString(), endTime - startTime);
        }
        BigInteger result = fib.implement(n);
        return new AlgorithmResult(result.toString());
    }
}
