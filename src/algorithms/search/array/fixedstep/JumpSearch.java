package algorithms.search.array.fixedstep;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;
import algorithms.search.array.base.SearchBase;

public class JumpSearch extends SearchBase {
    /**
     * Creates JumpSearch object with data array. Jump search must be done on a sorted array.
     */
    public JumpSearch() {
        super("Jump Search");
    }

    /**
     * Performs the jump search. Jump ahead in sorted array a fixed number of
     * steps and when larger than target, begin linear search. Optimal step
     * size is sqrt(n) hence O(sqrt n).
     */
    @Override
    public int implement(int[] nums, int target) {
        //jump size, square root of data size
        int step = (int) Math.floor(Math.sqrt(nums.length));

        int prev = 0;

        //find block where element is present
        while (nums[Math.min(step, nums.length) - 1] < target) {
            prev = step;
            step += step;
            if (prev >= nums.length) {
                //reached end of data, target not found
                return -1;
            }
        }

        //do linear search in block beginning with prev
        while (nums[prev] < target) {
            prev++;

            if (prev == Math.min(step, nums.length)) {
                //reached end of data or beginning of next block, target not found
                return - 1;
            }
        }
        if (nums[prev] == target) {
            return prev;
        }

        //not found
        return -1;
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments arrTargetAndSorted) {
        return super.runAndTime(this, arrTargetAndSorted);
    }
}
