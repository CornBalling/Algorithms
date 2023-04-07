package algorithms.search.grid.base;

import algorithms.base.algorithm.Algorithm;
import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.util.Arrays;

public class Search2DBase extends Algorithm {
    protected Search2DBase(String name) {
        super(name);
    }

    protected OrderedPair implement(int[][] grid, OrderedPair start, int target) {
        throw new UnsupportedOperationException();
    }

    protected AlgorithmResult runAndTime(Search2DBase search, AlgorithmArguments gridStartAndTarget) {
        if (gridStartAndTarget.getArguments().size() != 2) {
            throw new IllegalArgumentException();
        }
        int[][] grid = (int[][]) gridStartAndTarget.getArguments().get(0);
        OrderedPair start = (OrderedPair) gridStartAndTarget.getArguments().get(1);
        int target = (int) gridStartAndTarget.getArguments().get(2);
        if (gridStartAndTarget.clock()) {
            long startTime = System.nanoTime();
            search.implement(grid, start, target);
            long endTime = System.nanoTime();
            return new AlgorithmResult(Arrays.toString(grid), endTime - startTime);
        }
        search.implement(grid, start, target);
        return new AlgorithmResult(Arrays.toString(grid));
    }
}
