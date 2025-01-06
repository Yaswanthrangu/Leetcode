class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        HashMap <Character, Integer> mp1 = new HashMap<>();
        mp1.put('a', 0);
        mp1.put('b', 0);
        mp1.put('n', 0);
        for(int i = 0; i < n; i++) {
            if(text.charAt(i) == 'b' || text.charAt(i) == 'a' || text.charAt(i) == 'n') {
                mp1.put(text.charAt(i), mp1.getOrDefault(text.charAt(i), 0) + 1);
            }
        }
        HashMap <Character, Integer> mp2 = new HashMap<>();
        mp2.put('l', 0);
        mp2.put('o', 0);
        for(int i = 0; i < n; i++) {
            if(text.charAt(i) == 'o' || text.charAt(i) == 'l') {
                mp2.put(text.charAt(i), mp2.getOrDefault(text.charAt(i), 0) + 1);
            }
        }
        int cnt1 = Integer.MAX_VALUE;
        int cnt2 = Integer.MAX_VALUE;
        for(Character key : mp1.keySet()) {
            cnt1 = Math.min(cnt1, mp1.get(key));
        }
        for(Character key : mp2.keySet()) {
            cnt2 = Math.min(cnt2, mp2.get(key) / 2);
        }
        if(cnt1 == Integer.MAX_VALUE || cnt2 == Integer.MAX_VALUE) {
            return 0;
        }
        return Math.min(cnt1, cnt2);
    }
}