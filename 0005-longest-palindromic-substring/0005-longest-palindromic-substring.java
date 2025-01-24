class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start_point = 0;
        int max_len = 0;
        int dp[][] = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(isPalindrome(s, i, j, dp) == 1 && (j - i + 1 > max_len)) {
                    start_point = i;
                    max_len = j - i + 1;
                }
            }
        }
        return s.substring(start_point, start_point + max_len);
    }
    public static int isPalindrome(String s, int i, int j, int dp[][]) {
        if(i >= j) return 1;
        if(dp[i][j] != 0) return dp[i][j];
        if(s.charAt(i) == s.charAt(j)) {
            return dp[i][j] = isPalindrome(s, i + 1, j - 1, dp);
        }
        return dp[i][j] = 0;
    }
}