class Solution {
    public int[] findErrorNums(int[] nums) {
        int res[] = new int[2];
        int n = nums.length;
        int expected_sum = n * (n + 1) / 2;
        int set_sum = 0;
        HashSet <Integer> st = new HashSet<>();
        for(int ele : nums) {
            if(!st.contains(ele)) {
                set_sum += ele;
                st.add(ele);
            }
            else {
                res[0] = ele;
            }
        }
        res[1] = expected_sum - set_sum;
        return res;
    }
}