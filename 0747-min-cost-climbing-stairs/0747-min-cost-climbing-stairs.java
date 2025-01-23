class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int arr[] = new int[cost.length+1];
        Arrays.fill(arr, -1);
        return Math.min(solve(cost, 0, arr), solve(cost, 1, arr));
    }
    public static int solve(int cost[], int idx, int arr[]) {
        if(idx >= cost.length) {
            return 0;
        }
        if(arr[idx] != -1) {
            return arr[idx];
        }
        int one_step = cost[idx] + solve(cost, idx + 1, arr);
        int two_step = cost[idx] + solve(cost, idx + 2, arr);
        return arr[idx] = Math.min(one_step, two_step);
    }
}