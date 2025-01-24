class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        int max_len = Integer.MIN_VALUE;
        int start_point = Integer.MIN_VALUE;
        for(int len = 1; len <= n; len++) {
            for(int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                if(i == j) {
                    dp[i][j] = true;
                }
                else if(i + 1 == j) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                }
                else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true);
                }
                if(dp[i][j] == true) {
                    if(max_len < j - i + 1) {
                        start_point = i;
                        max_len = j - i + 1;
                    }
                }
            }
        }
        return s.substring(start_point, start_point + max_len);
    }
}