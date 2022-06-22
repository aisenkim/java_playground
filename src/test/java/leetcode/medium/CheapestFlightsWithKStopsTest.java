package leetcode.medium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheapestFlightsWithKStopsTest {

    static CheapestFlightsWithKStops solution;

    @BeforeAll
    static void setup() {
        solution = new CheapestFlightsWithKStops();
    }

    @Test
    void findCheapestPriceTest() {
        int n = 4;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0, dst = 3, k=1;

        assertEquals(solution.findCheapestPrice(n, flights, src,dst, k), 700);
    }
}