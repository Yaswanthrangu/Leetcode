class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int timeNeeded = 0;
        for(int i = 0; i < tickets.length; i++) {
            if(i <= k) {
                timeNeeded += Math.min(tickets[k], tickets[i]);
            }
            else {
                timeNeeded += Math.min(tickets[k] - 1, tickets[i]);
            }
        }
        return timeNeeded;
    }
}