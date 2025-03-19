class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        HashMap <Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            mp.put(s.charAt(i), i);
        }
        ArrayList <Integer> ans = new ArrayList<>();
        int size = 0;
        int end = 0;
        for(int i = 0; i < n; i++) {
            end = Math.max(end , mp.get(s.charAt(i)));
            size++;
            if(i == end) {
                ans.add(size);
                size = 0;
            }
        }
        return ans;
    }
}