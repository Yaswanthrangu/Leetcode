class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int dp[][] = new int[prices.length][2];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(prices, 0, n, 1, fee, dp);
    }
    public static int solve(int prices[], int idx, int n, int buy, int fee, int dp[][]) {
        if(idx >= n) return 0;
        if(dp[idx][buy] != -1) return dp[idx][buy];
        int profit = 0;
        if(buy == 1) {
            int buyNow = -prices[idx] + solve(prices, idx+1, n, 0, fee, dp);
            int buyLater = solve(prices, idx+1, n, 1, fee, dp);
            profit = Math.max(buyNow, buyLater);
        }
        else {
            int sellNow = prices[idx] - fee + solve(prices, idx+1, n, 1, fee, dp);
            int sellLater = solve(prices, idx+1, n, 0, fee, dp);
            profit = Math.max(sellNow, sellLater);
        }
        return dp[idx][buy] = profit;
    }
}