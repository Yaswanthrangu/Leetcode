public class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; // An empty string has one way to decode

        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) != '0') { // Single-character decoding
                dp[i] = dp[i - 1];
            }
            if (i > 1) { // Two-character decoding
                char first = s.charAt(i - 2);
                char second = s.charAt(i - 1);
                if (first == '1' || (first == '2' && second >= '0' && second <= '6')) {
                    dp[i] += dp[i - 2];
                }
            }
        }
        return dp[n];
    }
}
