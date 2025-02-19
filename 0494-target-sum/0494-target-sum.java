class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int totSum = 0;
        for(int num : nums) totSum += num;
        int dp[][] = new int[n][(2*totSum)+1];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2*totSum + 1; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        return solve(0, 0, target, nums, dp, totSum);
    }
    public static int solve(int idx, int currSum, int target, int nums[], int dp[][], int totSum) {
        if(idx == nums.length) {
            return currSum == target ? 1 : 0;
        }
        if(dp[idx][currSum + totSum] != Integer.MIN_VALUE) {
            return dp[idx][currSum + totSum];
        }
        int plus = solve(idx + 1, currSum + nums[idx], target, nums, dp, totSum);
        int minus = solve(idx + 1, currSum - nums[idx], target, nums, dp, totSum);
        return dp[idx][currSum + totSum] = plus + minus;
    }
}