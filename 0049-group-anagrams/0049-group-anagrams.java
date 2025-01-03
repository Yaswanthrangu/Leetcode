class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> mp = new HashMap<>();
        for(String str : strs) {
            int cntFreq[] = new int[26];
            for(char ch : str.toCharArray()) {
                cntFreq[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int val : cntFreq) {
                sb.append("#").append(val);
            }
            String formed = sb.toString();
            mp.putIfAbsent(formed, new ArrayList<>());
            mp.get(formed).add(str);
        }
        return new ArrayList(mp.values());
    }
}