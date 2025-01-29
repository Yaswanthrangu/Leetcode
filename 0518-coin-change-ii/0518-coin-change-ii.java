class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[] = new int[amount + 1];
        dp[0] = 1;
        for(int i = 0; i < coins.length; i++) {
            // if coins[i] = 5 loop from that idx because j - amount will give neg idx if starts from 0
            for(int j = coins[i]; j < dp.length; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}