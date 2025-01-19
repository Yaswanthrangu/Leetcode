class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int x = 0; x <= n; x++) {
            int idx = lower_bound(nums, x);
            if(n - idx == x) {
                return x;
            }
        }
        return -1;
    }
    public static int lower_bound(int nums[], int ele) {
        int low = 0;
        int high = nums.length;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] >= ele) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}