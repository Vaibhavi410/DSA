class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];   // buy price
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowest) {
                lowest = prices[i];
            } 
            else {
                int profit = prices[i] - lowest;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}