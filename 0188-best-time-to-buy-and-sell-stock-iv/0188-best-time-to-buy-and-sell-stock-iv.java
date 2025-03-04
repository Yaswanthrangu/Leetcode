class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n][2][k+1];
        for(int row[][] : dp) {
            for(int col[] : row) {
                Arrays.fill(col, -1);
            }
        }
        return solve(prices, 0, 1, k, dp);
    }
    public static int solve(int prices[], int idx, int buy, int cap, int dp[][][]) {
        if (cap == 0 || idx == prices.length) return 0;
        if (dp[idx][buy][cap] != -1) return dp[idx][buy][cap];
        int profit = 0;
        if(buy == 1) {
            int buyNow = -prices[idx] + solve(prices, idx + 1, 0, cap, dp);
            int buyLater = solve(prices, idx + 1, 1, cap, dp);
            profit = Math.max(buyNow, buyLater);
        }
        else {
            int sellNow = prices[idx] + solve(prices, idx + 1, 1, cap - 1, dp);
            int sellLater = solve(prices, idx + 1, 0, cap, dp);
            profit = Math.max(sellNow, sellLater);
        }
        return dp[idx][buy][cap] = profit;
    }
}