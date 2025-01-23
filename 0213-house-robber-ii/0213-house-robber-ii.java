class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) {
            return nums[0];
        }
        int dp1[] = new int[nums.length];
        int dp2[] = new int[nums.length];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        int preferring_zero = solve(nums, 0, dp1, n - 1);
        int preferring_first = solve(nums, 1, dp2, n);
        return Math.max(preferring_zero, preferring_first);
    }
    public static int solve(int nums[], int idx, int dp[], int n) {
        if(idx >= n) {
            return 0;
        }
        if(dp[idx] != -1) {
            return dp[idx];
        }
        int steal = nums[idx] + solve(nums, idx + 2, dp, n);
        int skip = solve(nums, idx + 1, dp, n);
        return dp[idx] = Math.max(steal, skip);
    }
}