class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet <String> st = new HashSet<>(wordDict);
        boolean dp[] = new boolean[n];
        for(int start = 0; start < n; start++) { // n - 1 index will be considered at last
            for(int end = start; end < n; end++) { // like a sub array
                String formed = s.substring(start, end+1); // end + 1 (0,1)
                // if end = n - 1 then to calculate the substring  = (n - 1, n)
                if((start == 0 || dp[start-1]) && st.contains(formed)) {
                    dp[end] = true;
                }
            }
        }
        return dp[n-1];
    }
}