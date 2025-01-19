class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int x_low = 0, x_high = n;
        while(x_low <= x_high) {
            int x_mid = x_low + (x_high - x_low) / 2;
            int idx = lower_bound(nums, x_mid);
            if(n - idx == x_mid) {
                return x_mid;
            }
            else if(n - idx > x_mid) {
                x_low = x_mid + 1;
            }
            else {
                x_high = x_mid - 1;
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