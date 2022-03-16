package algoexpert.recursion;

import java.util.ArrayList;
import java.util.List;

public class Powerset {

    public static List<List<Integer>> generatePowerset(List<Integer> array)  {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<Integer>());
        for(Integer num : array) {
           int length = subsets.size();
           for(int i=0; i<length; i++) {
               List<Integer> currentList = new ArrayList<>(subsets.get(i));
               currentList.add(num);
               subsets.add(currentList);
           }
        }
        return subsets;
    }

}
