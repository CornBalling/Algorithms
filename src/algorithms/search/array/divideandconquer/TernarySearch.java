package algorithms.search.array.divideandconquer;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;
import algorithms.search.array.base.SearchBase;

public class TernarySearch extends SearchBase {
    /**
     * Creates TernarySearch object with data array. Ternary search must be done on a sorted array.
     */
    public TernarySearch() {
        super("Ternary Search");
    }

    /**
     * Performs the ternary search with recursion. This is very similar to binary search except the region is
     * broken into thirds on each iteration. This reduces the time complexity to O(log_3 n) (whereas binary
     * search is O(log_2 n) ),however with the additional comparisons needed, actual time is no better
     * than binary search and in some cases worse.
     */
    @Override
    public int implement(int[] nums, int target) {
        return ternarySearch(nums, 0, nums.length - 1, target);
    }

    // Java program to illustrate - from https://www.geeksforgeeks.org/ternary-search/?ref=lbp
    // recursive approach to ternary search
    private int ternarySearch(int[] range, int left, int right, int target){
        if (right >= left) {

            // Find the leftMid and rightMid
            int leftMid = left + (right - left) / 3;
            int rightMid = right - (right - left) / 3;

            // Check if key is present at any mid
            if (range[leftMid] == target) {
                return leftMid;
            }
            if (range[rightMid] == target) {
                return rightMid;
            }

            // Since key is not present at mid,
            // check in which region it is present
            // then repeat the Search operation
            // in that region

            if (target < range[leftMid]) {

                // The key lies in between left and leftMid
                ternarySearch(range, left, leftMid - 1, target);
            }
            else if (target > range[rightMid]) {

                // The key lies in between rightMid and right
                ternarySearch(range, rightMid + 1, right, target);
            }
            else {

                // The key lies in between leftMid and rightMid
                ternarySearch(range, leftMid + 1, rightMid - 1, target);
            }
        }

        // Key not found
        return -1;
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments arrAndTarget) {
        return super.runAndTime(this, arrAndTarget);
    }
}
