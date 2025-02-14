class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet <String> wordSet = new HashSet<>(wordDict);
        boolean dp[][] = new boolean[n][n];
        for (int length = 1; length <= n; length++) {
            for (int start = 0; start <= n - length; start++) {
                int end = start + length - 1;

                if (wordSet.contains(s.substring(start, end + 1))) {
                    dp[start][end] = true;
                    continue; 
                }

                for (int mid = start; mid < end; mid++) {
                    if (dp[start][mid] && dp[mid + 1][end]) {
                        dp[start][end] = true;
                        break; 
                    }
                }
            }
        }
        return dp[0][n-1];
    }
}