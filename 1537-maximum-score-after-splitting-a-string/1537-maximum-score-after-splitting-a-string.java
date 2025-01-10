class Solution {
    public int maxScore(String s) {
        int zeroes = 0, ones = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '1') {
                ones++;
            }
        }
        int res = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == '0') {
                zeroes++;
            }
            else {
                ones--;
            }
            res = Math.max(res, ones + zeroes);
        }
        return res;
    }
}