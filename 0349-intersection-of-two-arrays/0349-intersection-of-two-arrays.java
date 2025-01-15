class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList <Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while(i < n && j < m) {
            if(nums1[i] < nums2[j]) {
                i++;
            }
            else if(nums1[i] > nums2[j]) {
                j++;
            }
            else {
                if(!res.contains(nums1[i])) {
                    res.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        int ans[] = new int[res.size()];
        for(int k = 0; k < res.size(); k++) {
            ans[k] = res.get(k);
        }
        return ans;
    }
}