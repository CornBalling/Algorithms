package algorithms.sort.iterative;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;
import algorithms.sort.base.SortBase;

/**
 * Class to implement a bubble sort on an array of integers.
 */
public class BubbleSort extends SortBase {

    /**
     * Constructs a bubble sort algorithm.
     */
    public BubbleSort() {
        super("Bubble Sort");
    }

    /**
     * Implements the Bubble Sort. This is a O(n^2) sorting algorithm where each element
     * is compared to it's neighbor and swapped if necessary until everything is in order.
     *
     * @param data array to be sorted
     */
    @Override
    public void implement(int[] data) {
        //go through the array one by one
        for (int i = 0; i < data.length - 1; i++) {
            //will place the largest element at the end of the unsorted part of the array
            for (int j = 0; j < data.length - i - 1; j++) {

                //swap neighbors if necessary
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments nums) {
        return super.runAndTime(this, nums);
    }
}
