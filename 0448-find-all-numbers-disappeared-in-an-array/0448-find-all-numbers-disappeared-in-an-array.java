class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for(int num : nums) {
            int i = Math.abs(num) - 1;
            nums[i] = -1 * Math.abs(nums[i]);
        }
        ArrayList <Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                res.add(i+1);
            }
        }
        return res;
    }
}