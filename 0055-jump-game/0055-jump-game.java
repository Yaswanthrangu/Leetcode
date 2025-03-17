class Solution {
    public boolean canJump(int[] nums) {
        Boolean dp[] = new Boolean[nums.length + 1];
        return solve(0, nums, nums.length, dp);
    }
    public static boolean solve(int idx, int nums[], int n, Boolean[] dp) {
        if(idx >= n - 1) return true;
        if(dp[idx] != null) return dp[idx];
        int possible = idx + nums[idx];
        for(int i = idx + 1; i <= possible; i++) {
            if(solve(i, nums, n, dp)) {
                return dp[idx] = true;
            }
        }
        return dp[idx] = false;
    }
}