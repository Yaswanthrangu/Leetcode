class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) {
            return false;
        }
        HashMap <Character, Character> mp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(!(mp.containsKey(s.charAt(i)))) {
                if(!(mp.containsValue(t.charAt(i)))) {
                    mp.put(s.charAt(i), t.charAt(i));
                }
                else {
                    return false;
                }
            }
            else {
                if(mp.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}