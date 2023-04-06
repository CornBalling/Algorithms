package algorithms.sort.iterative;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;
import algorithms.sort.base.SortBase;

/**
 * Class to implement a selection sort.
 */
public class SelectionSort extends SortBase {

    /**
     * Constructs a selection sort algorithm.
     */
    public SelectionSort() {
        super("Selection Sort");
    }

    /**
     * Implements the Selection Sort. This is a O(n^2) sorting algorithm where the index of
     * the minimum value is found and the element is swapped with the first. Once an element
     * is in its place, 'first' is the first unsorted element.
     *
     * @param data an array to be sorted
     */
    @Override
    public void implement(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            //set minimum index to the start of the subarray
            int minIndex = i;

            for (int j = i + 1; j < data.length; j++) {
                //find the next minimum element
                if (data[j] < data[minIndex]) {
                    //and store the index
                    minIndex = j;
                }
            }

            //swap minimum element and first element
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments nums) {
        return super.runAndTime(this, nums);
    }
}
