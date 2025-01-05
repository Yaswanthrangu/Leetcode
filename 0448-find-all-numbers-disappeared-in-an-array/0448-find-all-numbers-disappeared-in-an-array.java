class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for(int num : nums) {
            int idx = Math.abs(num) - 1;
            nums[idx] = -1 * Math.abs(nums[idx]);
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