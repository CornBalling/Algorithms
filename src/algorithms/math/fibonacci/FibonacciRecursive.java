package algorithms.math.fibonacci;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.math.BigInteger;
import java.util.List;

/**
 * This class' implement method uses recursion to find the nth fibonacci number.
 */
public class FibonacciRecursive extends FibonacciBase {
    /**
     * Constructs fibonacci algorithm using recursion to find the nth fibonacci
     * number
     */
    public FibonacciRecursive() {
        super("Fibonacci Recursive");
    }

    /**
     * Produces the nth fibonacci number using recursion where the sequence
     * begins with 0, 1, 1 ...
     *
     * @param n an argument for the algorithm
     * @return the n fibonacci number
     */
    @Override
    public BigInteger implement(int n) {
        //base cases
        if (n == 0 || n == 1) {
            return BigInteger.valueOf(n);
        }
        //recursive case
        return implement(n - 1).add(implement(n - 2));
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments num) {
        AlgorithmArguments modArgs = new AlgorithmArguments(
                List.of((int) num.getArguments().get(0) - 1), num.clock());
        return super.runAndTime(this, modArgs);
    }
}
