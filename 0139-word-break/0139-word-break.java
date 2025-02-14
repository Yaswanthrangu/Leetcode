class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet <String> st = new HashSet<>(wordDict);
        
        boolean dp[] = new boolean[n+1];
        dp[0] = true;
        
        for(int end = 1; end <= n; end++) {
            for(int stIdx = 0; stIdx < end; stIdx++) {
                if(dp[stIdx] && st.contains(s.substring(stIdx , end))) {
                    dp[end] = true;
                }
            }
        }
        return dp[n];
    }
}