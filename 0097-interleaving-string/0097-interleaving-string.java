class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();
        int l = s3.length();
        Boolean dp[][] = new Boolean[n+1][m+1];
        if(n + m != l) return false;
        return solve(0, 0, s1, s2, s3, n, m, l, dp);
    }
    public static boolean solve(int i, int j, String s1, String s2, String s3, int n, int m, int l, Boolean dp[][]) {
        if(i == n && j == m) {
            return true;
        }
        if(i+j >= l) {
            return false;
        }
        boolean result = false;
        if(dp[i][j] != null) return dp[i][j];
        if(i < n && s1.charAt(i) == s3.charAt(i+j)) {
            result = solve(i+1, j, s1, s2, s3, n, m, l, dp);
        }
        if(result) return dp[i][j] = true;
        if(j < m && s2.charAt(j) == s3.charAt(i+j)) {
            result = solve(i, j+1, s1, s2, s3, n, m, l, dp);
        }
        return dp[i][j] = result;
    }
}