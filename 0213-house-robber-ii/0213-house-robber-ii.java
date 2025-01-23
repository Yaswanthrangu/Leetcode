class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) {
            return nums[0];
        }
        if(n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int res1 = solve(nums, 0, n - 2);
        int res2 = solve(nums, 1, n - 1);
        return Math.max(res1, res2);
    }
    public static int solve(int nums[], int start, int end) {
        int prevPrev = 0;
        int prev = 0;
        for(int i = start; i <= end; i++) {
            int curr = Math.max(prevPrev + nums[i], prev);
            prevPrev = prev;
            prev = curr;
        }
        return prev;
    }
}