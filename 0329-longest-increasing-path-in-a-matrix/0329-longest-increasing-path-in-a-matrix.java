class Solution {
    int directions[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans = 0;
        int dp[][] = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < m; c++) {
                // No need to store in dp here as the answer will be return from dp from dfs
                ans = Math.max(ans, dfs(matrix, r, c, Integer.MIN_VALUE, n, m, dp));
            }
        }
        return ans;
    }
    public int dfs(int matrix[][], int r, int c, int prevValue, int n, int m, int dp[][]) {
        if(r < 0 || r >= n || c < 0 || c >= m || matrix[r][c] <= prevValue) {
            // prev value helps in passing the current cell value to more dfs directions
            return 0;
        }
        if(dp[r][c] != -1) return dp[r][c];
        int res = 1;
        for(int d[] : directions) {
            res = Math.max(res, 1 + dfs(matrix, r + d[0], c + d[1], matrix[r][c], n, m, dp));
        }
        return dp[r][c] = res;
    }
}