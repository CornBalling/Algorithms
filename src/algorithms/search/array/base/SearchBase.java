package algorithms.search.array.base;

import algorithms.base.algorithm.Algorithm;
import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.util.Arrays;

public class SearchBase extends Algorithm {
    protected SearchBase(String name) {
        super(name);
    }

    protected int implement(int[] nums, int target) {
        throw new UnsupportedOperationException();
    }

    protected AlgorithmResult runAndTime(SearchBase search, AlgorithmArguments arrTargetAndSorted) {
        if (arrTargetAndSorted.getArguments().size() != 3) {
            throw new IllegalArgumentException();
        }

        int[] nums = (int[]) arrTargetAndSorted.getArguments().get(0);
        int target = (int) arrTargetAndSorted.getArguments().get(1);
        boolean sorted = (boolean) arrTargetAndSorted.getArguments().get(2);

        if (sorted) {
            Arrays.sort(nums);
        }

        if (arrTargetAndSorted.clock()) {
            long startTime = System.nanoTime();
            search.implement(nums, target);
            long endTime = System.nanoTime();
            return new AlgorithmResult(Arrays.toString(nums), endTime - startTime);
        }
        search.implement(nums, target);
        return new AlgorithmResult(Arrays.toString(nums));
    }
}
