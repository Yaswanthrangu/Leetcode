class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet <Integer> st = new HashSet<>();
        for(int i = 0; i < n; i++) {
            st.add(nums[i]);
        }
        if(st.size() < n) return true;
        else return false;
    }
}