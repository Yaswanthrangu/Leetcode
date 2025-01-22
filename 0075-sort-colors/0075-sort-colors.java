class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = 0, k = nums.length - 1;
        while(j <= k) {
            if(nums[j] == 0) {
                swap(nums, i, j);
                i++;
                j++;
            }
            else if(nums[j] == 1) {
                j++;
            }
            else {
                swap(nums, j, k);
                k--;
            }
        }
    }
    public static void swap(int nums[], int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}