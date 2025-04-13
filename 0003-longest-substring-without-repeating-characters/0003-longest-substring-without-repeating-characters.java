class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        HashSet <Character> st = new HashSet<>();
        int l = 0;
        for(int r = 0; r < n; r++) {
            while(st.contains(s.charAt(r))) {
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            maxlen = Math.max(maxlen, r - l + 1);
        }
        return maxlen;
    }
}