package algoexpert.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutations(0, array, permutations);
        return permutations;
    }

    /**
     * Helper method
     */
    public static void getPermutations(int i, List<Integer> array, List<List<Integer>> permutations) {
        if (i == array.size() - 1) {
            permutations.add(array);
        } else {
            for (int j = i; j < array.size(); j++) {
                swap(i, j, array); // put in different position
                getPermutations(i + 1, array, permutations);
                swap(i, j, array); // put it back to original position
            }
        }
    }

    private static void swap(int i, int j, List<Integer> array) {
        Integer tmp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, tmp);
    }

}
