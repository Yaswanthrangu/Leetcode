class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length + 1][amount + 1];
        for(int i = 0; i < coins.length + 1; i++) {
            for(int j = 0; j < amount + 1; j++) {
                dp[i][j] = -1;
            }
        }
        int result = solve(coins.length - 1, coins, amount, 0, dp);
        return result == (Integer.MAX_VALUE) ? -1 : result;
    }
    public static int solve(int idx, int coins[], int amt, int curr_sum, int dp[][]) {
        if(curr_sum == amt) return 0;
        if(curr_sum > amt) return Integer.MAX_VALUE;
        if(idx < 0) return Integer.MAX_VALUE;
        if(dp[idx][curr_sum] != -1) {
            return dp[idx][curr_sum];
        }
        int include = solve(idx, coins, amt, curr_sum + coins[idx], dp);
        if(include != Integer.MAX_VALUE) include += 1;
        int exclude = solve(idx - 1, coins, amt, curr_sum, dp);
        return dp[idx][curr_sum] = Math.min(include, exclude);
    }
}