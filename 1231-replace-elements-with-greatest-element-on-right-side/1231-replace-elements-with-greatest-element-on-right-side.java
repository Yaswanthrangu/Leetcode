class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            int ansi = -1;
            for(int j = i+1; j < n; j++) {
                ansi = Math.max(ansi, arr[j]);
            }
            ans[i] = ansi;
        }
        return ans;
    }
}