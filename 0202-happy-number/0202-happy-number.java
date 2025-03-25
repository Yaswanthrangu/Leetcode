class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> st = new HashSet<>();
        while(!st.contains(n)) {
            st.add(n);
            n = squaresOfSum(n);
            if(n == 1) {
                return true;
            }
        }
        return false;
    }
    public int squaresOfSum(int n) {
        int total = 0;
        while(n > 0) {
            int rem = n % 10;
            total += (rem * rem);
            n /= 10;
        }
        return total;
    }
}