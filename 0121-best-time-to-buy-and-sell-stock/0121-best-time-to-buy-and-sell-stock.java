class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxi = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int today_price = prices[i];
            if(today_price < buyPrice) {
                buyPrice = today_price;
            }
            else if(today_price - buyPrice > maxi) {
                maxi = today_price - buyPrice;
            }
        }
        return maxi;
    }
}