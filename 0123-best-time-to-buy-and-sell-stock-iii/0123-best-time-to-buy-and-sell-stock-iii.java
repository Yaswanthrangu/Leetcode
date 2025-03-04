class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n+1][2][3];
        // if capacity == 0
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2; j++) {
                dp[i][j][0] = 0;
            }
        }
        // if prices size is n
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                dp[n][i][j] = 0;
            }
        }
        // tabulation
        for(int idx = n - 1; idx >= 0; idx--) {
            for(int buy = 0; buy < 2; buy++) {
                for(int cap = 1; cap <= 2; cap++) {
                    if(buy == 1) {
                        dp[idx][buy][cap] = Math.max(-prices[idx] + dp[idx+1][0][cap] , dp[idx+1][1][cap]);
                    }
                    else {
                        dp[idx][buy][cap] = Math.max(prices[idx] + dp[idx+1][1][cap-1], dp[idx+1][0][cap]);
                    }
                }
            }
        }
        return dp[0][1][2];
    }
}