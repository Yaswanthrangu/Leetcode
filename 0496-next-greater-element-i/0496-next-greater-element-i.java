class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            mp.put(nums1[i], i);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = -1;
        }
        Stack<Integer> st = new Stack<>();
        for(int i = nums2.length - 1; i >= 0; i--) {
            while(!st.isEmpty() && nums2[i] >= st.peek()) {
                st.pop();
            }
            if(mp.containsKey(nums2[i])) {
                res[mp.get(nums2[i])] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(nums2[i]);
        }
        return res;
    }
}