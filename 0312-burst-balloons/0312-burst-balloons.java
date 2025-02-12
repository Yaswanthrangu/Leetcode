class Solution {
    public int maxCoins(int[] nums) {
        int arr[] = new int[nums.length+2];
        arr[0] = 1;
        arr[nums.length+1] = 1;
        for(int i = 1; i <= nums.length; i++) {
            arr[i] = nums[i-1];
        }
        int dp[][] = new int[nums.length+2][nums.length+2];
        for(int i = 0; i < nums.length+2; i++) {
            for(int j = 0; j < nums.length+2; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(1, nums.length, arr, dp);
    }
    public static int solve(int i, int j, int arr[], int dp[][]) {
        if(i > j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int mini = Integer.MIN_VALUE;
        for(int k = i; k <= j; k++) {
            int cost = arr[i-1] * arr[k] * arr[j+1] + solve(i, k-1, arr, dp) + solve(k+1, j, arr, dp);
            mini = Math.max(mini, cost);
        }
        return dp[i][j] = mini;
    }
}