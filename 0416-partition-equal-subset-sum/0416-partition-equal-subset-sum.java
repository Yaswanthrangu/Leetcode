class Solution {
    public boolean canPartition(int[] nums) {
        int total_sum = 0;
        for(int i = 0; i < nums.length; i++) {
            total_sum += nums[i];
        }
        if(total_sum % 2 != 0) return false;
        int req_sum = total_sum / 2;
        boolean dp[][] = new boolean[nums.length + 1][req_sum + 1];
        for(int i = 0; i < nums.length + 1; i++) {
            dp[i][0] = true;
        }
        for(int i = 1; i < nums.length + 1; i++) {
            for(int j = 1; j < req_sum + 1; j++) {
                if(nums[i-1] <= j) {
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[nums.length][req_sum];
    }
}