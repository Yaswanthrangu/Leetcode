class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int i = 0;
        int j = 0;
        if (n1 == 0) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        while(j < n2) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                if(i == n1) {
                    return true;
                }
            }
            j++;
        }
        return false;
    }
}