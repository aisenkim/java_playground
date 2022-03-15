package leetcode.array;

public class BestTimeToBuySellStock {

    public int getMaxProfit(int[] prices) {
        int curProfit = 0;
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++) {
            curProfit += prices[i] - prices[i - 1];
            curProfit = Math.max(0, curProfit);
            maxProfit = Math.max(curProfit, maxProfit);
        }
        return maxProfit;
    }
}
