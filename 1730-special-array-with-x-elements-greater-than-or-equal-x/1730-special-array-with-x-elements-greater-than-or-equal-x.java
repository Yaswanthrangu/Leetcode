class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for(int x = 0; x <= n; x++) {
            int cnt = 0;
            for(int i = 0; i < n; i++) {
                if(nums[i] >= x) {
                    cnt++;
                }
            }
            if(cnt == x) {
                return cnt;
            }
        }
        return -1;
    }
}