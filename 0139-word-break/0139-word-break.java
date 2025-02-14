class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet <String> st = new HashSet<>();
        for(String str : wordDict) {
            st.add(str);
        }
        Boolean dp[] = new Boolean[s.length()];
        return solve(0, st, n, s, dp);
    }
    public static boolean solve(int idx, HashSet <String> st, int n, String s, Boolean dp[]) {
        if(idx == n) return true;
        if(dp[idx] != null) return dp[idx];
        for(int end = idx+1; end <= n; end++) {
            String formed = s.substring(idx, end);
            if(st.contains(formed) && solve(end, st, n, s, dp)) {
                return dp[idx] = true;
            }
        }
        return dp[idx] = false;
    }
}