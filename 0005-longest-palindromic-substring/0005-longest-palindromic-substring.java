class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start_point = 0;
        int max_len = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(isPalindrome(s, i, j) && (j - i + 1 > max_len)) {
                    start_point = i;
                    max_len = j - i + 1;
                }
            }
        }
        return s.substring(start_point, start_point + max_len);
    }
    public static boolean isPalindrome(String s, int i, int j) {
        if(i >= j) return true;
        if(s.charAt(i) == s.charAt(j)) {
            return isPalindrome(s, i + 1, j - 1);
        }
        return false;
    }
}