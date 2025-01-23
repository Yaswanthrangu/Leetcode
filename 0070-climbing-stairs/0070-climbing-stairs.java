class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2) {
            return n;
        }
        int a = 1;
        int b = 2;
        int c = 0;
        for(int k = 3; k <= n; k++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}