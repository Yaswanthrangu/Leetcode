class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr2[] = s.split(" ");
        int n1 = pattern.length();
        int n2 = arr2.length;
        if(n1 != n2) {
            return false;
        }
        HashMap <Character, String> mp1 = new HashMap<>();
        HashMap <String, Character> mp2 = new HashMap<>();
        for(int i = 0; i < n1; i++) {
            if(mp1.containsKey(pattern.charAt(i))) {
                if(!mp1.get(pattern.charAt(i)).equals(arr2[i])) {
                    return false;
                }
            }
            mp1.put(pattern.charAt(i), arr2[i]);
            if(mp2.containsKey(arr2[i])) {
                if(!mp2.get(arr2[i]).equals(pattern.charAt(i))) {
                    return false;
                }
            }
            mp2.put(arr2[i], pattern.charAt(i));
        }
        return true;
    }
}