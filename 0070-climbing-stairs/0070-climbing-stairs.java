class Solution {
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr, -1);
        return solve_Func(arr, n);
    }
    public static int solve_Func(int arr[], int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        if(arr[n] != -1) {
            return arr[n];
        }
        int one_step = solve_Func(arr, n - 1);
        int two_step = solve_Func(arr, n - 2);
        return arr[n] = one_step + two_step;
    }
}