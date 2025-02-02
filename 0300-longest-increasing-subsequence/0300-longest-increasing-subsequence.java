class Solution {
    public int lengthOfLIS(int[] nums) {
        HashSet <Integer> st = new HashSet<>();
        for(int num : nums) {
            st.add(num);
        }
        int arr[] = new int[st.size()];
        int i = 0;
        for(int num : st) {
            arr[i] = num;
            i++;
        }
        Arrays.sort(arr);
        return lcs(nums, arr);
    }
    public static int lcs(int nums[], int arr[]) {
        int dp[][] = new int[nums.length+1][arr.length+1];
        for(int i = 0; i < nums.length+1; i++) {
            dp[i][0] = 0;
        }
        for(int i = 0; i < arr.length+1; i++) {
            dp[0][i] = 0;
        }
        for(int i = 1; i < nums.length+1; i++) {
            for(int j = 1; j < arr.length+1; j++) {
                if(nums[i-1] == arr[j-1]) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[nums.length][arr.length];
    }
}