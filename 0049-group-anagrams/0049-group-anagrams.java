class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> mp = new HashMap<>();
        for(String str : strs) {
            char chr[] = str.toCharArray();
            Arrays.sort(chr);
            String formed = new String(chr);
            mp.putIfAbsent(formed, new ArrayList<>());
            mp.get(formed).add(str);
        }
        return new ArrayList(mp.values());
    }
}