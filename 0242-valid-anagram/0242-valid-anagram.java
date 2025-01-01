class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) {
            return false;
        }
        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();
        for(int i = 0; i < n; i++) {
            mp1.put(s.charAt(i), mp1.getOrDefault(s.charAt(i), 0)+1);
            mp2.put(t.charAt(i), mp2.getOrDefault(t.charAt(i), 0)+1);
        }
        return mp1.equals(mp2);
    }
}