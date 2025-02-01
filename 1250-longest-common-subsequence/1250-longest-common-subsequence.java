class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length() + 1][text2.length() + 1];
        for(int i = 0; i < text1.length() + 1; i++) {
            for(int j = 0; j < text2.length() + 1; j++) {
                dp[i][j] = -1;
            }
        }
        return lcs(text1, text2, text1.length(), text2.length(), dp);
    }
    public static int lcs(String t1, String t2, int n, int m, int dp[][]) {
        if(n == 0 || m == 0) return 0;
        if(dp[n][m] != -1) return dp[n][m];
        if(t1.charAt(n - 1) == t2.charAt(m - 1)) {
            return dp[n][m] = lcs(t1, t2, n - 1, m - 1, dp) + 1;
        }
        else {
            int ans1 = lcs(t1, t2, n - 1, m, dp);
            int ans2 = lcs(t1, t2, n, m - 1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }
}