class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int res = -1;
        HashMap <Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char curr_char = s.charAt(i);
            if(mp.containsKey(curr_char)) {
                res = Math.max(res, i - mp.get(curr_char) - 1);
            }
            else {
                mp.put(curr_char, i);
            }
        }
        return res;
    }
}