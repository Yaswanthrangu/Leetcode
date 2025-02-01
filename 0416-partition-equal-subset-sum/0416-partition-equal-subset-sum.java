class Solution {
    public boolean canPartition(int[] nums) {
        int total_sum = 0;
        for(int i = 0; i < nums.length; i++) {
            total_sum += nums[i];
        }
        if(total_sum % 2 != 0) return false;
        int req_sum = total_sum / 2;
        Boolean dp[][] = new Boolean[nums.length + 1][req_sum + 1];
        return solve(nums.length - 1, nums, req_sum, 0, dp);
    }
    public static boolean solve(int idx, int nums[], int target, int curr_sum, Boolean dp[][]) {
        if(curr_sum == target) return true;
        if(idx < 0) return false;
        if(curr_sum > target) return false;
        if(dp[idx][curr_sum] != null) return dp[idx][curr_sum];
        Boolean include = solve(idx - 1, nums, target, curr_sum + nums[idx], dp);
        Boolean exclude = solve(idx - 1, nums, target, curr_sum, dp);
        return dp[idx][curr_sum] = include || exclude;
    }
}