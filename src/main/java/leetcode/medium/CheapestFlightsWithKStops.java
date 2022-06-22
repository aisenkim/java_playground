package leetcode.medium;

import java.util.Arrays;

public class CheapestFlightsWithKStops {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] costs = new int[n];
        Arrays.fill(costs, Integer.MAX_VALUE);
        costs[src] = 0;
        for(int i=0; i<=k; i++) { // at most k+1 stops
           int[] costTmp = Arrays.copyOf(costs, n); // tmp costs for each round of stops
            for(int[] f : flights) {
                int from=f[0], to=f[1], price=f[2];
                if(costs[from] == Integer.MAX_VALUE) continue;
                costTmp[to] = Math.min(costTmp[to], costTmp[from] + price);
            }
            costs = costTmp;
        }
        return costs[dst] == Integer.MAX_VALUE ? -1 : costs[dst];
    }

}
