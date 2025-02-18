class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap <String, Integer> mp = new HashMap<>();
        return solve(nums, 0, 0, target, mp);
    }
    public static int solve(int nums[], int idx, int currSum, int target, HashMap <String, Integer> mp) {
        if(idx == nums.length) {
            if(currSum == target) return 1;
            else return 0;
        }
        String key = idx + "_" + currSum;
        if(mp.containsKey(key)) return mp.get(key);
        int plus = solve(nums, idx + 1, currSum + nums[idx], target, mp);
        int minus = solve(nums, idx + 1, currSum - nums[idx], target, mp);
        mp.put(key, plus + minus);
        return mp.get(key);
    }
}