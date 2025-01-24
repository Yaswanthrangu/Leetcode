class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int cnt = 0;
        int dp[][] = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(isPalindrome(s, i, j, dp) == 1) {
                    cnt++;
                }
            }
        }
        return cnt;
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