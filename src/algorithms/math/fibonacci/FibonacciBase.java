package algorithms.math.fibonacci;

import algorithms.base.algorithm.Algorithm;
import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.math.BigInteger;

public class FibonacciBase extends Algorithm {

    protected FibonacciBase(String name) {
        super(name);
    }

    protected BigInteger implement(int num) {
        throw new UnsupportedOperationException();
    }

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
