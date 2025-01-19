class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int freqArr[] = new int[n + 1];
        for(int num : nums) {
            if(num > n) {
                freqArr[n]++;
            }
            else {
                freqArr[num]++;
            }
        }
        int cumulative_sum = 0;
        for(int i = n; i >= 0; i--) {
            cumulative_sum += freqArr[i];
            if(cumulative_sum == i) {
                return i;
            }
        }
        return -1;
    }
}