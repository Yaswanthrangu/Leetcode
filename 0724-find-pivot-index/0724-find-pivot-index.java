class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int tot = 0;
        for(int ele : nums) {
            tot += ele;
        }
        int lsum = 0;
        for(int i = 0; i < n; i++) {
            int rsum = tot - lsum - nums[i];
            if(lsum == rsum) {
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }
}