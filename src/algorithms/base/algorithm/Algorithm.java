package algorithms.base.algorithm;

/**
 * Class representing a specific algorithm.
 */
public class Algorithm {
    protected String name;

    /**
     * For super calls.
     */
    protected Algorithm(String name) {
        this.name = name;
    }

    /**
     * Verifies arguments, does any needed setup and calls a private method to carry
     * out the algorithm's logic.
     *
     * @param algorithmArguments the algorithm arguments
     * @return the algorithm's result
     */
    public AlgorithmResult kickOff(AlgorithmArguments algorithmArguments) {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the algorithm's name.
     *
     * @return algorithm's name
     */
    @Override
    public String toString() {
        return name;
    }
}
