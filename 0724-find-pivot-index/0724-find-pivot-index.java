class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int lsum[] = new int[n];
        int suml = 0;
        for(int i = 0; i < n; i++) {
            suml += nums[i];
            lsum[i] = suml;
        }
        int rsum[] = new int[n];
        int sumr = 0;
        for(int i = n - 1; i >= 0; i--) {
            sumr += nums[i];
            rsum[i] = sumr;
        }
        for(int i = 0; i < n; i++) {
            if(lsum[i] == rsum[i]) {
                return i;
            }
        }
        return -1;
    }
}