class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int bp = 0; bp < n; bp++) {
            int lsum = 0;
            int rsum = 0;
            for(int i = 0; i < bp; i++) {
                lsum += nums[i];
            }
            for(int i = bp+1; i < n; i++) {
                rsum += nums[i];
            }
            if(lsum == rsum) {
                return bp;
            }
        }
        return -1;
    }
}