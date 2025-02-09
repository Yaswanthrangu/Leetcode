class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i = 0; i < obstacleGrid.length; i++) {
            for(int j = 0; j < obstacleGrid[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0, 0, obstacleGrid.length, obstacleGrid[0].length, obstacleGrid, dp);
    }
    public static int solve(int i, int j, int m, int n, int obstacleGrid[][], int dp[][]) {
        if(i < 0 || i >= m || j < 0 || j >= n || obstacleGrid[i][j] == 1) {
            return 0;
        }
        if(i == m - 1 && j == n - 1) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        int down = solve(i+1, j, m, n, obstacleGrid, dp);
        int right = solve(i, j+1, m, n, obstacleGrid, dp);
        return dp[i][j] = down + right;
    }
}