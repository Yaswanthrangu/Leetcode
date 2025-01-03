class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int min_len = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            min_len = Math.min(min_len, strs[i].length());
        }
        int i = 0;
        while(i < min_len) {
            for(String s : strs) {
                if(s.charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }
        return strs[0].substring(0, i);
    }
}