class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxi = 0;
        int sellPrice = Integer.MIN_VALUE;
        for(int i = n-1; i >= 0; i--) {
            int today_price = prices[i];
            if(today_price > sellPrice) {
                sellPrice = today_price;
            }
            else if(sellPrice - today_price > maxi) {
                maxi = sellPrice - today_price;
            }
        }
        return maxi;
    }
}