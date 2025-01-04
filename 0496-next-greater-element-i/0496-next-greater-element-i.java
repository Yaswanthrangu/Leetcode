class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int res[] = new int[n];
        Arrays.fill(res, -1);
        HashMap <Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            mp.put(nums1[i], i);
        }
        for(int i = 0; i < m; i++) {
            if(mp.containsKey(nums2[i])) {
                for(int j = i+1; j < m; j++) {
                    if(nums2[i] < nums2[j]) {
                        res[mp.get(nums2[i])] = nums2[j];
                        break;
                    }
                }
            }
        }
        return res;
    }
}