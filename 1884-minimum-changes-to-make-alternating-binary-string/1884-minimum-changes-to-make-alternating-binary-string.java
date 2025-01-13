class Solution {
    public int minOperations(String s) {
        int start_with_zero = 0;   // 010101...
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 == 0) {  // even position
                if(s.charAt(i) == '1') {
                    start_with_zero++;
                }
            }
            else {  // odd position
                if(s.charAt(i) == '0') {
                    start_with_zero++;
                }
            }
        }
        return Math.min(start_with_zero, s.length() - start_with_zero);
    }
}