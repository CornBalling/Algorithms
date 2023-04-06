package algorithms.search.array.fixedstep;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;
import algorithms.search.array.base.SearchBase;

public class LinearSearch extends SearchBase {
    /**
     * Creates LinearSearch object with data array.
     */
    public LinearSearch() {
        super("Linear Search");
    }

    /**
     * Performs the linear search. Simply looks at every element in the array and checks if it
     * is what we are looking for. O(n) operation, but with benefit that array need not be sorted.
     */
    @Override
    public int implement(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments arrAndTarget) {
        return super.runAndTime(this, arrAndTarget);
    }
}
