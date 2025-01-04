class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ele = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(cnt == 0) {
                ele = nums[i];
                cnt++;
            }
            else if(ele == nums[i]) {
                cnt++;
            }
            else {
                cnt--;
            }
        }
        int verification_count = 0;
        for(int i = 0; i < n; i++) {
            if(ele == nums[i]) {
                verification_count++;
            }
        }
        if(verification_count > (n/2)) {
            return ele;
        }
        return -1;
    }
}