class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        return solve(nums, 0, dp);
    }
    public static int solve(int nums[], int idx, int dp[]) {
        int n = nums.length;
        if(idx >= n) {
            return 0;
        }
        if(dp[idx] != -1) {
            return dp[idx];
        }
        int steal = nums[idx] + solve(nums, idx + 2, dp);
        int skip = solve(nums, idx + 1, dp);
        return dp[idx] = Math.max(steal, skip);
    }
}