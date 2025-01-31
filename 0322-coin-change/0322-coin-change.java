class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] = Math.min(dp[j], 1 + dp[j - coin]);
            }
        }
        return dp[amount] == Integer.MAX_VALUE - 1 ? -1 : dp[amount];
    }
}