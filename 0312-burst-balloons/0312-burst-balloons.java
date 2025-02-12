class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n][n];
        for(int len = 1; len <= n; len++) {
            for(int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                for(int k = i; k <= j; k++) {
                    // Cost got from left sub problem
                    // k == i (if there are no left balloons and bursting current at last = 0)
                    int left = (k == i) ? 0 : dp[i][k - 1];
                    int right = (k == j) ? 0 : dp[k+1][j];
                    int cur = ((i == 0 ? 1 : nums[i-1]) * nums[k] * (j == n - 1 ? 1 : nums[j+1]));
                    dp[i][j] = Math.max(dp[i][j], left + right + cur);
                }
            }
        }
        return dp[0][n-1];
    }
}