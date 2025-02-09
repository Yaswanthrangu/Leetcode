class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0, 0, grid.length, grid[0].length, grid, dp);
    }
    public static int solve(int i, int j, int m, int n, int grid[][], int dp[][]) {
        if(i == m - 1 && j == n - 1) {
            return grid[i][j];
        }
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        if(i == m - 1) {
            return dp[i][j] = grid[i][j] + solve(i, j+1, m, n, grid, dp);
        }
        else if(j == n - 1) {
            return dp[i][j] = grid[i][j] + solve(i+1, j, m, n, grid, dp);
        }
        else {
            return dp[i][j] = grid[i][j] + Math.min(solve(i, j+1, m, n, grid, dp), solve(i+1, j, m, n, grid, dp));
        }
    }
}