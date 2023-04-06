package algorithms.math.gcd;

import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.base.algorithm.AlgorithmResult;

import java.util.List;

/**
 * This class' implement method calculates the GCD and gives the result
 * as a Bezout identity in the form "gcd = s*a + t*b".
 */
public class ExtendedEuclideanGCD extends GCDBase {

    private int x;
    private int oldOldS;
    private int oldOldT;

    /**
     * Constructs Extended Euclidean GCD algorithm.
     */
    public ExtendedEuclideanGCD() {
        super("Extended Euclidean Greatest Common Divisor");
    }

    /**
     * Calculates Bezout identity for GCD of a and b in the form "gcd = s*a + t*b".
     *
     * @param a a positive integer
     * @param b a positive integer
     * @return Bezout identity for GCD
     */
    @Override
    public int implement(int a, int b) {
        x = a;
        int y = b;
        oldOldS = 1;
        int oldS = 0;
        oldOldT = 0;
        int oldT = 1;
        while (y != 0) {
            int q = x / y;
            int r = x % y;
            x = y;
            y = r;
            int s = oldOldS - q * oldS;
            int t = oldOldT - q * oldT;
            oldOldS = oldS;
            oldOldT = oldT;
            oldS = s;
            oldT = t;
        }
        return x;
    }

    private String getLinearCombination(int gcd, int sj, int tj, int a, int b) {
        String sign = tj < 0 ? " - " : " + ";
        return String.format("%d = %d * %d", gcd, sj, a) +
                sign + String.format("%d * %d", Math.abs(tj), b);
    }

    @Override
    public AlgorithmResult kickOff(AlgorithmArguments aAndB) {
        List<Object> objects = aAndB.getArguments();
        int a = (int) objects.get(0);
        int b = (int) objects.get(1);
        AlgorithmResult result = super.runAndTime(this, aAndB);
        String bezout = getLinearCombination(x, oldOldS, oldOldT, a, b);
        return new AlgorithmResult(bezout, result.getTimeElapsed());
    }
}
