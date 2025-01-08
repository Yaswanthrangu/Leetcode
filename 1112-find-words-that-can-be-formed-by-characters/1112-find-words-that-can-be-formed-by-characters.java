class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap <Character, Integer> count = new HashMap<>();
        for(char c : chars.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (String s : words) {
            HashMap <Character, Integer> cutWord = new HashMap<>();
            for(char c : s.toCharArray()) {
                cutWord.put(c, cutWord.getOrDefault(c, 0) + 1);
            }
            boolean good = true;
            for(char c : cutWord.keySet()) {
                if(cutWord.get(c) > count.getOrDefault(c, 0)) {
                    good = false;
                    break;
                }
            }
            if(good) {
                res += s.length();
            }
        }
        return res;
    }
}