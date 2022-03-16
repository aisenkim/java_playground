package leetcode.array;

import leetcode.array.BestTimeToBuySellStock;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuySellStockTest {
    static BestTimeToBuySellStock bestTime;

    @BeforeAll
    static void setup() {
        bestTime = new BestTimeToBuySellStock();
    }

    @Test
    void getMaxProfitExists() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int maxProfit = bestTime.getMaxProfit(prices);
        assertEquals(5, maxProfit);
    }

    @Test
    void noProfitExists() {
        int[] prices = new int[]{7, 6, 5, 4, 3, 2};
        int maxProfit = bestTime.getMaxProfit(prices);
        assertEquals(0, maxProfit);
    }

}