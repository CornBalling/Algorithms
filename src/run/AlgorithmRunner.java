package run;

import algorithms.base.algorithm.Algorithm;
import algorithms.base.algorithm.AlgorithmArguments;
import algorithms.math.factorial.FactorialIterative;
import algorithms.math.factorial.FactorialRecursive;

import java.util.List;

public class AlgorithmRunner {
    public static void main(String[] args) {
        Algorithm[] gcdAlgorithms = {new FactorialIterative(), new FactorialRecursive()};
        AlgorithmArguments gcdArgs = new AlgorithmArguments(List.of(9), true);
        for (Algorithm gcdAlgorithm : gcdAlgorithms) {
            System.out.println(gcdAlgorithm + " " + gcdAlgorithm.kickOff(gcdArgs));
        }
    }
}
