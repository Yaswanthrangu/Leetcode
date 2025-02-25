class Solution {
    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][2];
        for(int i = 0; i < prices.length; i++) {
            for(int j = 0; j < 2; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0, prices, 0, prices.length, dp);
    }
    public static int solve(int idx, int prices[], int buy, int n, int dp[][]) {
        if(idx == n) {
            return 0;
        }
        if(dp[idx][buy] != -1) return dp[idx][buy];
        int profit = 0;
        if(buy == 0) {
            int buyNow = -prices[idx] + solve(idx+1, prices, 1, n, dp);
            int buyLater = 0 + solve(idx+1, prices, 0, n, dp);
            profit = Math.max(buyNow, buyLater);
        }
        else {
            int sellNow = prices[idx] + solve(idx+1, prices, 0, n, dp);
            int sellLater = 0 + solve(idx+1, prices, 1, n, dp);
            profit = Math.max(sellNow, sellLater);
        }
        return dp[idx][buy] = profit;
    }
}