package algorithms.math.factorial;

import algorithms.base.algorithm.Algorithm;
import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.math.BigInteger;

public class FactorialBase extends Algorithm {
    protected FactorialBase(String name) {
        super(name);
    }

    protected BigInteger implement(int n) {
        throw new UnsupportedOperationException();
    }

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
