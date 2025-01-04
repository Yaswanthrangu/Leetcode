class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList <Integer> ar = new ArrayList<>();
        for(int value : nums) {
            if(value != val) {
                ar.add(value);
            }
        }
        for(int i = 0; i < ar.size(); i++) {
            nums[i] = ar.get(i);
        }
        return ar.size();
    }
}