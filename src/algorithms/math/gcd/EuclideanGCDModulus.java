package algorithms.math.gcd;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

/**
 * This class' implement method finds the Greatest Common Divisor of two integers
 * using Euclid's modulus algorithm.
 */
public class EuclideanGCDModulus extends GCDBase {
    /**
     * Constructs Euclid GCD modulus algorithm.
     */
    public EuclideanGCDModulus() {
        super("Euclidean Greatest Common Divisor Modulus");
    }

    /**
     * Finds GCD of a and b using Euclid's modulus algorithm.
     *
     * @param a a positive integer
     * @param b a positive integer
     * @return the GCD of a and b
     */
    @Override
    public int implement(int a, int b) {
                                //------Alternate while loop
        while (b != 0) {        //  while (b != 0) {
            int r = a % b;      //      int t = b;
            a = b;              //      b = a % b;
            b = r;              //      a = t;
        }                       //  }
        return a;
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments aAndB) {
        return super.runAndTime(this, aAndB);
    }
}
