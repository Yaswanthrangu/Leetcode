class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a , b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            minHeap.add(entry);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int res[] = new int[k];
        for(int i = k - 1; i >= 0; i--) {
            res[i] = minHeap.poll().getKey();
        }
        return res;
    }
}