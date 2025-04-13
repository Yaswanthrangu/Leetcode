class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> mp = new HashMap<>();
        int ans[] = new int[k];
        for(int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue <Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            pq.add(entry);
        }
        int z = 0;
        for(int i = 0; i < k; i++) {
            ans[z++] = pq.poll().getKey();
        }
        return ans;
    }
}