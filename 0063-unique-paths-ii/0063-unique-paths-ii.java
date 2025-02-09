class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
        if(obstacleGrid[0][0] != 1) {
            dp[0][0] = 1;
        }
        else {
            dp[0][0] = 0;
        }
        for(int row = 1; row < obstacleGrid.length; row++) {
            if(obstacleGrid[row][0] != 1) {
                dp[row][0] = dp[row-1][0];
            }
            else{
                break;
            }
        }
        for(int col = 1; col < obstacleGrid[0].length; col++) {
            if(obstacleGrid[0][col] != 1) {
                dp[0][col] = dp[0][col-1];
            }
            else{
                break;
            }
        }
        for(int i = 1; i < obstacleGrid.length; i++) {
            for(int j = 1; j < obstacleGrid[0].length; j++) {
                if(obstacleGrid[i][j] != 1) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}