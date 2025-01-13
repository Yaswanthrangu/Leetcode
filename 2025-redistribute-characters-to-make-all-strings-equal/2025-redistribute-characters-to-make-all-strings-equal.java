class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> charCnt = new HashMap<>();

        for (String w : words) {
            for (char c : w.toCharArray()) {
                charCnt.put(c, charCnt.getOrDefault(c, 0) + 1);
            }
        }

        for (int count : charCnt.values()) {
            if (count % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}