package algorithms.sort.divideandconquer;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;
import algorithms.sort.base.SortBase;

/**
 * Class to implement a merge sort.
 */
public class MergeSort extends SortBase {
    /**
     * Constructs a merge sort algorithm.
     */
    public MergeSort() {
        super("Merge Sort");
    }

    /**
     * Calls sort method to perform the merge sort. This is a O(nlog n) time and O(n) space sort operation.
     * Array(s) is/are repeated divided in two (log n) and n comparisons are made when merging.
     */
    @Override
    public void implement(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            //sort left
            sort(nums, left, mid);
            //sort right
            sort(nums, mid + 1, right);

            //merge both halves
            int leftSize = mid - left + 1;
            int rightSize = right - mid;

            int[] leftCopy = new int[leftSize];
            int[] rightCopy = new int[rightSize];

            //copy contents to new arrays
            System.arraycopy(nums, left, leftCopy, 0, leftSize);
            System.arraycopy(nums, mid + 1, rightCopy, 0, rightSize);

            //indexes for left, right and merged arrays
            int li = 0, ri = 0, mi = left;

            //add lower of both to merged array until one array is used up
            while (li < leftSize && ri < rightSize) {
                if (leftCopy[li] < rightCopy[ri]) {
                    nums[mi++] = leftCopy[li++];
                } else {
                    nums[mi++] = rightCopy[ri++];
                }
            }

            //add remaining from left if any
            while (li < leftSize) {
                nums[mi++] = leftCopy[li++];
            }

            //add remaining from right if any
            while (ri < rightSize) {
                nums[mi++] = rightCopy[ri++];
            }
        }
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments nums) {
        return super.runAndTime(this, nums);
    }
}
