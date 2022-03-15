package algoexpert.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @Test
    @DisplayName("Test 1: [1,2,3]")
    void firstTest() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Integer[][] result = new Integer[][]{
                {1, 2, 3},
                {1, 3, 2},
                {2, 1, 3},
                {2, 3, 1},
                {3, 2, 1},
                {3, 1, 2}
        };
        List<List<Integer>> permutations = Permutations.getPermutations(numbers);
    }

}