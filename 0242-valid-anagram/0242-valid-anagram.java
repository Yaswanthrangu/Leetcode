class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) {
            return false;
        }
        int res[] = new int[26];
        for(int i = 0; i < n; i++) {
            res[s.charAt(i) - 'a']++;
            res[t.charAt(i) - 'a']--;
        }
        for(int val : res) {
            if(val != 0) {
                return false;
            }
        }
        return true;
    }
}