class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();
        int l = s3.length();
        Boolean dp[][][] = new Boolean[n+1][m+1][l+1];
        if(n + m != l) return false;
        return solve(0, 0, 0, s1, s2, s3, n, m, l, dp);
    }
    public static boolean solve(int i, int j, int k, String s1, String s2, String s3, int n, int m, int l, Boolean dp[][][]) {
        if(i == n && j == m && k == l) {
            return true;
        }
        if(k >= l) {
            return false;
        }
        boolean result = false;
        if(dp[i][j][k] != null) return dp[i][j][k];
        if(i < n && s1.charAt(i) == s3.charAt(k)) {
            result = solve(i+1, j, k+1, s1, s2, s3, n, m, l, dp);
        }
        if(result) return true;
        if(j < m && s2.charAt(j) == s3.charAt(k)) {
            result = solve(i, j+1, k+1, s1, s2, s3, n, m, l, dp);
        }
        return dp[i][j][k] = result;
    }
}