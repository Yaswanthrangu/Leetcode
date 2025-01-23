class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prevPrev = 0;
        int prev = nums[0];
        for(int i = 2; i <= n; i++) {  // i = 2 resembles nums[1]
            int steal = nums[i - 1] + prevPrev;
            int skip = prev;
            int curr = Math.max(steal, skip);
            prevPrev = prev;
            prev = curr;
        }
        return prev;
    }
}