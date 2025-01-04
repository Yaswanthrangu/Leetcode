class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) {
            return false;
        }
        HashMap <Character, Character> charsS = new HashMap<>();
        HashMap <Character, Character> charsT = new HashMap<>();
        for(int i = 0; i < n; i++) {
            char intial = s.charAt(i);
            char replacer = t.charAt(i);
            if(charsS.containsKey(intial)) {
                if(charsS.get(intial) != replacer) {
                    return false;
                }
            }
            else {
                charsS.put(intial, replacer);
            }
            if(charsT.containsKey(replacer)) {
                if(charsT.get(replacer) != intial) {
                    return false;
                }
            }
            else {
                charsT.put(replacer, intial);
            }
        }
        return true;
    }
}