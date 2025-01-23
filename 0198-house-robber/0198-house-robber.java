class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int res1 = 0;
        int res2 = 0;
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int i = 1; i <= n; i++) {
            int steal = nums[i - 1] + ((i - 2 >= 0) ? dp[i - 2] : 0);
            int skip = dp[i - 1];
            dp[i] = Math.max(steal, skip);
        }
        res1 = dp[n];
        Arrays.fill(dp, 0);
        for(int i = 2; i <= n - 1; i++) {
            int steal = nums[i - 1] + dp[i - 2];
            int skip = dp[i - 1];
            dp[i] = Math.max(steal, skip);
        }
        res2 = dp[n];
        return Math.max(res1, res2);
    }
}