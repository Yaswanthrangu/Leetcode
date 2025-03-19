class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n % groupSize != 0) return false;
        HashMap <Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            mp.put(hand[i], mp.getOrDefault(hand[i], 0) + 1);
        }
        PriorityQueue <Integer> minHeap = new PriorityQueue<>(mp.keySet());
        while(!minHeap.isEmpty()) {
            int firstPossibleEleInNewSet = minHeap.peek();
            for(int i = firstPossibleEleInNewSet; i < firstPossibleEleInNewSet + groupSize; i++) {
                // if 9 is required in loop but 9 it self doesn't exist in map
                if(!mp.containsKey(i)) {
                    return false;
                }
                mp.put(i, mp.get(i) - 1);
                // if decremented is 2 and count is 0 but count of 1 is more than 0
                if(mp.get(i) == 0) {
                    if(i != minHeap.peek()) {
                        return false;
                    }
                    minHeap.poll();
                }
            }
        }
        return true;
    }
}