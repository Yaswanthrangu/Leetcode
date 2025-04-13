class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int n = nums.length;
        Arrays.sort(nums);
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        for(int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]) {
                ans[i] = ans[i-1];
            }
            else if(nums[i] > nums[i-1] && nums[i] == nums[i-1] + 1) {
                ans[i] = ans[i-1] + 1;
            }
        }
        int maxi = 1;
        for(int ele : ans) {
            maxi = Math.max(ele, maxi);
        }
        return maxi;
    }
}