class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList <Integer> res = new ArrayList<>();
        HashSet <Integer> st = new HashSet<>();
        for(int num : nums1) {
            st.add(num);
        }
        for(int ele : nums2) {
            if(st.contains(ele)) {
                res.add(ele);
                st.remove(ele);
            }
        }
        int ans[] = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}