package algorithms.search.array.divideandconquer;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;
import algorithms.search.array.base.SearchBase;

public class BinarySearchRecursive extends SearchBase {
    /**
     * Creates BinarySearch object with data array. Binary search must be done on a sorted array.
     */
    public BinarySearchRecursive() {
        super("Binary Search Recursive");
    }

    /**
     * Performs the binary search using recursion. This is a O(log n) search operation since at
     * each step the algorithm eliminates half the remaining possibilities.
     */
    @Override
    public int implement(int[] nums, int target) {
        return recursiveBinarySearch(nums, 0, nums.length - 1, target);
    }

    private int recursiveBinarySearch(int[] nums, int left, int right, int target) {
        //stopping condition, range is no longer valid
        if (right < left) {
            return right;
        }

        //set middle of range
        int mid = left + (right - left) / 2;

        //did we find it at mid?
        if (nums[mid] == target) {
            return mid;
        }

        //if element at mid is greater than target,
        //recursively call ignoring right half
        if (nums[mid] > target) {
            return recursiveBinarySearch(nums, left, mid - 1, target);
        //if element at mid is less than target,
        //recursively call ignoring left half
        } else {
            return recursiveBinarySearch(nums, mid + 1, right, target);
        }
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments arrTargetAndSorted) {
        return super.runAndTime(this, arrTargetAndSorted);
    }
}
