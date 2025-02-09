class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0,0, m, n, dp);
    }
    public static int solve(int i, int j, int m, int n, int dp[][]) {
        // reached destination
        if(i == m - 1 && j == n - 1) return 1;
        // out of bounds
        if(i < 0 || i >= m || j < 0 || j >= n) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int down = solve(i+1, j, m, n, dp);
        int right = solve(i, j+1, m, n, dp);
        return dp[i][j] = down + right;
    }
}