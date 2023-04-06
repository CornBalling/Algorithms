package run;

import algorithms.base.algorithm.Algorithm;

public class TimeTrial {

    public long trial(Algorithm a) {
        long start = System.currentTimeMillis();
        //a.kickOff();
        long end = System.currentTimeMillis();

        return end - start;
    }

    private int maxStringLength(Algorithm ... algorithms) {
        int maxLen = Integer.MIN_VALUE;
        for (Algorithm algorithm : algorithms) {
            int algLen = algorithm.toString().length();
            if (algLen > maxLen) {
                maxLen = algLen;
            }
        }
        return maxLen;
    }
    public void compareTime(Algorithm ... algorithms) {
        int maxLen = maxStringLength(algorithms);

        for (Algorithm algorithm : algorithms) {
            System.out.printf("%" + maxLen + "s : %10d ms.\n",
                                    algorithm,     trial(algorithm));
        }
    }
}
