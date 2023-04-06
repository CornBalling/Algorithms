package algorithms.search.array.divideandconquer;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;
import algorithms.search.array.base.SearchBase;

public class BinarySearchIterative extends SearchBase {
    /**
     * Creates BinarySearch object with data array. Binary search must be done on a sorted array.
     */
    public BinarySearchIterative() {
        super("Binary Search Iterative");
    }

    /**
     * Performs the binary search using iteration. This is a O(log n) search operation
     * since at each step the algorithm eliminates half the remaining possibilities.
     */
    @Override
    public int implement(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        //break array in half again and again until the
        //range is invalid, meaning target was not found
        while (left <= right) {
            //middle of the range
            int mid = left + (right - left) / 2;

            //did we find it at mid?
            if (nums[mid] == target) {
                return mid;
            }

            //when not found...

            //if middle is higher than target, ignore right half
            if (nums[mid] > target) {
                right = mid - 1;

            //if middle is lower than target, ignore left half
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments arrTargetAndSorted) {
        return super.runAndTime(this, arrTargetAndSorted);
    }
}
