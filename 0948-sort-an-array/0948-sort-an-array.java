class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    public static void quickSort(int nums[], int low, int high) {
        if(low < high) {
            int pivot_idx = partition(nums, low, high);
            quickSort(nums, low, pivot_idx - 1);
            quickSort(nums, pivot_idx + 1, high);
        }  
    }
    public static int partition(int nums[], int low, int high) {
        int i = low, j = high;
        Random rand = new Random();
        int pivot_idx = low + rand.nextInt(high - low + 1);
        int pivot = nums[pivot_idx];
        nums[pivot_idx] = nums[low];
        nums[low] = pivot;
        while(i < j) {
            while(nums[i] <= pivot && i < high) {
                i++;
            }
            while(nums[j] > pivot && j > low) {
                j--;
            }
            if(i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    }
}