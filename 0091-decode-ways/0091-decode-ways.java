public class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(n == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int prev1 = 1, prev2 = 1;   // 1 for 1st character as we passed from above base condition
        for (int i = 1; i < n; i++) {
            int curr = 0;
            if (s.charAt(i) != '0') {
                curr = prev1;
            }
            if(i - 1 >= 0) {
                char first = s.charAt(i - 1);
                char second = s.charAt(i);
                if (first == '1' || (first == '2' && second >= '0' && second <= '6')) {
                    curr += prev2;
                }
            }
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
