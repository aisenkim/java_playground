package algoexpert.graph;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RiverSizesTest {

    @Test
    void riverSizes() {
        int[][] input = {
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0},
        };
        List<Integer> actual = RiverSizes.riverSizes(input);
        Collections.sort(actual);
        List<Integer> expected = List.of(1, 2, 2, 2, 5);
        assertEquals(actual, expected);
    }
}