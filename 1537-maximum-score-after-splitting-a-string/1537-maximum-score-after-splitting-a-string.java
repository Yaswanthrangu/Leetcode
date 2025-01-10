class Solution {
    public int maxScore(String s) {
        int res = 0;
        for(int bp = 0; bp < s.length() - 1; bp++) {
            int temp = 0;
            for(int left = 0; left <= bp; left++) {
                if(s.charAt(left) == '0') {
                    temp++;
                }
            }
            for(int right = bp + 1; right < s.length(); right++) {
                if(s.charAt(right) == '1') {
                    temp++;
                }
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}