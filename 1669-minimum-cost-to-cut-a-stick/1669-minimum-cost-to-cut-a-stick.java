class Solution {
    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        int arr[] = new int[m+2];
        arr[0] = 0;
        arr[m+1] = n;
        for(int i = 1; i <= m; i++) {
            arr[i] = cuts[i-1];
        }
        int dp[][] = new int[m+2][m+2];
        Arrays.sort(arr);
        for(int len = 2; len <= m + 1; len++) {
            for(int row = 0; row <= m+1-len; row++) {
                int col = len + row;
                dp[row][col] = Integer.MAX_VALUE; // 0 overiding with infinity
                for(int k = row+1; k <= col-1; k++) {
                    int totalCost = dp[row][k] + dp[k][col] + (arr[col] - arr[row]);
                    dp[row][col] = Math.min(totalCost, dp[row][col]);
                }
            }
        }
        return dp[0][m+1];
    }
}