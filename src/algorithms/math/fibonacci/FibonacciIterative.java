package algorithms.math.fibonacci;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.math.BigInteger;

/**
 * This class' implement method returns the nth fibonacci number using iteration.
 */
public class FibonacciIterative extends FibonacciBase {
    /**
     * Constructs fibonacci algorithm for calculating the nth fibonacci number using iteration.
     */
    public FibonacciIterative() {
        super("Fibonacci Iterative");
    }

    /**
     * Computes the nth fibonacci number using iteration.
     *
     * @param n an argument for the algorithm
     * @return nth fibonacci number
     */
    @Override
    public BigInteger implement(int n) {
        if (n == 1 || n == 2) {
            return BigInteger.valueOf(n).subtract(BigInteger.ONE);
        }

        BigInteger prepre = BigInteger.ZERO;
        BigInteger pre = BigInteger.ONE;
        BigInteger nextFib = BigInteger.ONE;
        while (n > 2) {
            nextFib = prepre.add(pre);
            prepre = pre;
            pre = nextFib;
            n--;
        }
        return nextFib;
    }

    /**
     * Kicks off the algorithm running / timing fiesta!
     * Calls the {@code runAndTime()} method in base class which in turn calls implement here.
     *
     * @param num the algorithm arguments
     * @return result containing factorial of n
     */
    @Override
    public AlgorithmResult kickOff(AlgorithmArguments num) {
        return super.runAndTime(this, num);
    }
}
