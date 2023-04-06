package algorithms.math.gcd;

import algorithms.base.algorithm.Algorithm;
import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.util.List;

public class GCDBase extends Algorithm {
    protected GCDBase(String name) {
        super(name);
    }

    protected int implement(int a, int b) {
        throw new UnsupportedOperationException();
    }

    protected AlgorithmResult runAndTime(GCDBase gcd, AlgorithmArguments aAndB) {
        List<Object> objects = aAndB.getArguments();
        int a = (int) objects.get(0);
        int b = (int) objects.get(1);
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b must be positive");
        }
        if (aAndB.clock()) {
            long startTime = System.nanoTime();
            int result = gcd.implement(a, b);
            long endTime = System.nanoTime();
            return new AlgorithmResult(Integer.toString(result), endTime - startTime);
        }
        int result = gcd.implement(a, b);
        return new AlgorithmResult(Integer.toString(result));
    }
}
