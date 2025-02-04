class Solution {
    public boolean isMatch(String s, String p) {
        boolean dp[][] = new boolean[s.length()+1][p.length()+1];
        // both pattern and string are empty
        dp[0][0] = true;
        // if pattern of length 0, but string is of more length
        // pattern cannot be able to match
        for(int i = 1; i < s.length()+1; i++) {
            dp[i][0] = false;
        }
        // if string is empty but pattern has 2 cases :
        // 1) if current character is empty, need to check the previous value stored in dp
        // 2) else any other character results false
        for(int i = 1; i < p.length()+1; i++) {
            if(p.charAt(i-1) == '*') {
                dp[0][i] = dp[0][i-1];
            }
        }
        // filling up in a bottom up apparoach
        for(int i = 1; i < s.length()+1; i++) {
            for(int j = 1; j < p.length()+1; j++) {
                // equal or ? makes to check in dp table that i-1 matches with j-1 length of both
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                }
                // ignored || try to match more than 1
                else if(p.charAt(j-1) == '*') {
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }
                else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}