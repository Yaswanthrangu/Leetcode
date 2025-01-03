class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap <Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int isPresent = target - nums[i];
            if(mp.containsKey(isPresent)) {
                return new int[] {i, mp.get(isPresent)};
            }
            mp.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}