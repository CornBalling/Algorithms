package algorithms.math.fibonacci;

import algorithms.base.algorithm.Algorithm;
import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * This class' implement method returns a list of fibonacci numbers up to n.
 */
public class FibonacciList extends Algorithm {
    public FibonacciList() {
        super("Fibonacci List");
    }

    public List<BigInteger> implement(Integer n) {
        List<BigInteger> fibs = new ArrayList<>();
        if (n >= 1) {
            fibs.add(BigInteger.ZERO);
        }
        if (n >= 2) {
            fibs.add(BigInteger.ONE);
        }

        int curr = 2;
        while (n > 2) {
            BigInteger newFib = fibs.get(curr - 2).add(fibs.get(curr - 1));
            fibs.add(newFib);
            curr++;
            n--;
        }
        return fibs;
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments num) {
        int n = (int) num.getArguments().get(0);
        if (n < 1) {
            throw new IllegalArgumentException("Must request at least 1 fibonacci number");
        }
        long startTime = 0;
        if (num.clock()) {
            startTime = System.nanoTime();
            List<BigInteger> result = implement(n);
            long endTime = System.nanoTime();
            return new AlgorithmResult(result.toString(), endTime - startTime);
        }
        List<BigInteger> result = implement(n);
        return new AlgorithmResult(result.toString());
    }
}
