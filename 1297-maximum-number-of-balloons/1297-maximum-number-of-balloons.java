class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> mp = new HashMap<>();
        for (char c : text.toCharArray()) {
            if ("balon".indexOf(c) != -1) {
                mp.put(c, mp.getOrDefault(c, 0) + 1);
            }
        }
        if (mp.size() < 5) {
            return 0;
        }
        mp.put('l', mp.get('l') / 2);
        mp.put('o', mp.get('o') / 2);
        return Collections.min(mp.values());
    }
}