class Solution {
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length + 1][amount + 1];
         // Initialize the dp array to -1 to indicate uncomputed states instead of 0
        for (int i = 0; i <= coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0, coins, amount, dp);
    }
    public static int solve(int idx, int coins[], int amt, int dp[][]) {
        if(amt == 0) return 1;
        if(dp[idx][amt] != -1) {
            return dp[idx][amt];
        }
        if(idx == coins.length) return 0;
        if(coins[idx] > amt) {
            return solve(idx+1, coins, amt, dp);
        }
        int take = solve(idx, coins, amt - coins[idx], dp);
        int skip = solve(idx + 1, coins, amt, dp);
        return dp[idx][amt] = take + skip;
    }
}