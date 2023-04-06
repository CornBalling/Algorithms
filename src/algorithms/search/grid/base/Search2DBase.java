package algorithms.search.grid.base;

import algorithms.base.algorithm.Algorithm;
import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.util.Arrays;

public class Search2DBase extends Algorithm {
    protected Search2DBase(String name) {
        super(name);
    }

    protected OrderedPair implement(int[][] grid, int target) {
        throw new UnsupportedOperationException();
    }

    protected AlgorithmResult runAndTime(Search2DBase search, AlgorithmArguments gridAndTarget) {
        if (gridAndTarget.getArguments().size() != 2) {
            throw new IllegalArgumentException();
        }
        int[][] grid = (int[][]) gridAndTarget.getArguments().get(0);
        int target = (int) gridAndTarget.getArguments().get(1);
        if (gridAndTarget.clock()) {
            long startTime = System.nanoTime();
            search.implement(grid, target);
            long endTime = System.nanoTime();
            return new AlgorithmResult(Arrays.toString(grid), endTime - startTime);
        }
        search.implement(grid, target);
        return new AlgorithmResult(Arrays.toString(grid));
    }
}
