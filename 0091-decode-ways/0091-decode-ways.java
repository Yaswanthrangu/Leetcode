class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        int n = s.length();
        return solve(0, s, n, dp);
    }
    public static int solve(int idx, String s, int n, int dp[]) {
        if(dp[idx] != -1) {
            return dp[idx];
        }
        if(idx >= n) {
            return dp[idx] = 1;
        }
        if(s.charAt(idx) == '0') {
            return dp[idx] = 0;
        }
        int only_ith_place_split = solve(idx + 1, s, n, dp);
        int two_places_from_i = 0;
        if(idx + 1 < n) {
            if(s.charAt(idx) == '1' || (s.charAt(idx+1) <='6' && s.charAt(idx) == '2')) {
                two_places_from_i = solve(idx + 2, s, n, dp);
            }
        }
        return dp[idx] = only_ith_place_split + two_places_from_i;
    }
}