class Solution {
    public int minCost(int n, int[] cuts) {
        int newCuts[] = new int[cuts.length+2];
        newCuts[0] = 0;
        newCuts[newCuts.length-1] = n;
        for(int i = 1; i <= cuts.length; i++) {
            newCuts[i] = cuts[i-1];
        }
        Arrays.sort(newCuts);
        int dp[][] = new int[newCuts.length][newCuts.length];
        for(int i = 0; i < newCuts.length; i++) {
            for(int j = 0; j < newCuts.length; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0, newCuts.length-1, newCuts, dp);
    }
    public static int solve(int l, int r, int newCuts[], int dp[][]) {

        if(r-l <= 1) return 0; // impossible to cut
        if(dp[l][r] != -1) {
            return dp[l][r];
        }
        int res = Integer.MAX_VALUE;
        for(int idx = l+1; idx <= r-1; idx++) {
            int cost = (newCuts[r] - newCuts[l]) + solve(l, idx, newCuts, dp) + solve(idx, r, newCuts, dp);
            res = Math.min(res, cost);
            dp[l][r] = res;
        }
        return res;
    }
}