class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int curr[][] = new int[2][3];
        int after[][] = new int[2][3];
        // tabulation
        for(int idx = n - 1; idx >= 0; idx--) {
            for(int buy = 0; buy < 2; buy++) {
                for(int cap = 1; cap <= 2; cap++) {
                    if(buy == 1) {
                        curr[buy][cap] = Math.max(-prices[idx] + after[0][cap] , after[1][cap]);
                    }
                    else {
                        curr[buy][cap] = Math.max(prices[idx] + after[1][cap-1], after[0][cap]);
                    }
                }
            }
            after = curr;
        }
        return after[1][2];
    }
}