package algorithms.sort.base;

import algorithms.base.algorithm.Algorithm;
import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.util.Arrays;

public class SortBase extends Algorithm {
    protected SortBase(String name) {
        super(name);
    }

    protected void implement(int[] arr) {
        throw new UnsupportedOperationException();
    }

    protected AlgorithmResult runAndTime(SortBase sort, AlgorithmArguments arr) {
        if (arr.getArguments().size() != 0) {
            throw new IllegalArgumentException();
        }
        int[] nums = (int[]) arr.getArguments().get(0);
        if (arr.clock()) {
            long startTime = System.nanoTime();
            sort.implement(nums);
            long endTime = System.nanoTime();
            return new AlgorithmResult(Arrays.toString(nums), endTime - startTime);
        }
        sort.implement(nums);
        return new AlgorithmResult(Arrays.toString(nums));
    }
}
