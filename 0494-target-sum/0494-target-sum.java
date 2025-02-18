class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, 0, 0, target);
    }
    public static int solve(int nums[], int idx, int currSum, int target) {
        if(idx == nums.length) {
            if(currSum == target) return 1;
            else return 0;
        }
        int plus = solve(nums, idx + 1, currSum + nums[idx], target);
        int minus = solve(nums, idx + 1, currSum - nums[idx], target);
        return plus + minus;
    }
}