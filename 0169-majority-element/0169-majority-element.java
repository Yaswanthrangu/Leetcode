class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            int ele = nums[i];
            for(int j = 0; j < n; j++) {
                if(nums[i] == nums[j]) {
                    cnt++;
                }
            }
            if(cnt > (n/2)) {
                return ele;
            }
        }
        return -1;
    }
}