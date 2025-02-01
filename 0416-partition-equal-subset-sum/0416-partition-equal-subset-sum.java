class Solution {
    public boolean canPartition(int[] nums) {
        int total_sum = 0;
        for (int num : nums) {
            total_sum += num;
        }
        if (total_sum % 2 != 0) return false;
        int req_sum = total_sum / 2;
        boolean[] dp = new boolean[req_sum + 1];
        dp[0] = true;
        for (int num : nums) {
            // Traverse j backward to avoid multiple usage of num in the same iteration
            for (int j = req_sum; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }
        return dp[req_sum];
    }
}