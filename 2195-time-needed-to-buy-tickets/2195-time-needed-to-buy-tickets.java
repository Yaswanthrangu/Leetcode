class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue <Integer> q = new LinkedList<>();
        for(int i = 0; i < tickets.length; i++) {
            q.add(i);
        }
        int timeNeeded = 0;
        while(!q.isEmpty()) {
            timeNeeded++;
            int idFront = q.peek();
            q.poll();
            tickets[idFront]--;
            if(idFront == k && tickets[idFront] == 0) {
                return timeNeeded;
            }
            if(tickets[idFront] != 0) {
                q.add(idFront);
            }
        }
        return -1;
    }
}