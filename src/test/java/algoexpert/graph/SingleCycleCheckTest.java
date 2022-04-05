package algoexpert.graph;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleCycleCheckTest {

    static SingleCycleCheck solution;

    @BeforeAll
    static void setup() {
        solution = new SingleCycleCheck();
    }

    @Test
    @DisplayName("Single Cycle Check - Basic Example")
    void hasSingleCycleTest() {
        int[] input = new int[]{2, 3, 1, -4, -4, 2};
        boolean actual = solution.hasSingleCycle(input);
        boolean expected = true;

        assertEquals(expected, actual);
    }

}