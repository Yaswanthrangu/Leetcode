class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int dp[][] = new int[k+1][n];
        for(int i = 1; i <= k; i++) {
            for(int j = 1; j < n; j++) {
                int tillNow = 0;
                for (int m = 0; m < j; m++) {
                    tillNow = Math.max(tillNow, dp[i-1][m] + prices[j] - prices[m]);
                }
                dp[i][j] = Math.max(dp[i][j-1], tillNow);
            }
        }
        return dp[k][n-1];
    }
}