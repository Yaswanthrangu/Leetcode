class Solution {
    public int jump(int[] nums) {
        int dp[] = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return solve(0, nums, nums.length, dp);
    }
    public static int solve(int idx, int nums[], int n, int dp[]) {
        if(idx >= n - 1) {
            return 0;
        }
        if(dp[idx] != -1) {
            return dp[idx];
        }
        int maxPossible = idx + nums[idx];
        int minJumps = Integer.MAX_VALUE;
        for(int i = idx + 1; i <= maxPossible; i++) {
            int jumps = solve(i, nums, n, dp);
            if(jumps != Integer.MAX_VALUE) {
                minJumps = Math.min(jumps + 1, minJumps);
            }   
        }
        return dp[idx] = minJumps;
    }
}