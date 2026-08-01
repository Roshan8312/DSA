class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minE = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            profit = Math.max(profit,prices[i] - minE);
            minE = Math.min(minE,prices[i]);
        }
        return profit;
    }
}