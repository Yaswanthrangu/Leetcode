class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        if(sum(gas) - sum(cost) < 0) return -1;
        int total = 0;
        int idxAns = 0;
        for(int idx = 0; idx < n; idx++) {
            total += gas[idx] - cost[idx];
            if(total < 0) {
                total = 0;
                idxAns = idx + 1;
            }
        }
        return idxAns;
    }
    public static int sum(int arr[]) {
        int ans = 0;
        for(int ele : arr) {
            ans += ele;
        }
        return ans;
    }
}