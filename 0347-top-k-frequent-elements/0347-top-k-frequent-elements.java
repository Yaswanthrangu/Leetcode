class Pair {
    int ele;
    int freq;
    public Pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList <Pair> ar = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            ar.add(new Pair(entry.getKey(), entry.getValue()));
        }
        ar.sort((a, b) -> b.freq - a.freq);
        int ans[] = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = ar.get(i).ele;
        }
        return ans;
    }
}