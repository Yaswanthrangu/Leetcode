class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int dp[][] = new int[cuts.length][cuts.length];
        for(int i = 0; i < cuts.length; i++) {
            for(int j = 0; j < cuts.length; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0, n, cuts, 0, cuts.length-1, dp);
    }
    public static int solve(int start_stick, int end_stick, int cuts[], int leftCut, int rightCut, int dp[][]) {
        int res = Integer.MAX_VALUE;
        if(leftCut > rightCut) {
            return 0;
        }
        if(dp[leftCut][rightCut] != -1) return dp[leftCut][rightCut];
        for(int i = leftCut; i <= rightCut; i++) {
            int left_cut_cost = solve(start_stick, cuts[i], cuts, leftCut, i-1, dp);
            int right_cut_cost = solve(cuts[i], end_stick, cuts, i+1, rightCut, dp);
            int total_cost = (end_stick - start_stick) + left_cut_cost + right_cut_cost;
            res = Math.min(res, total_cost);
        }
        return dp[leftCut][rightCut] = res;
    }
}