class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] leftZero = new int[n];
        int[] rightOne = new int[n];

        if (s.charAt(0) == '0') {
            leftZero[0] = 1;
        }
        for (int i = 1; i < n; i++) {
            leftZero[i] = leftZero[i - 1];
            if (s.charAt(i) == '0') {
                leftZero[i]++;
            }
        }

        if (s.charAt(n - 1) == '1') {
            rightOne[n - 1] = 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            rightOne[i] = rightOne[i + 1];
            if (s.charAt(i) == '1') {
                rightOne[i]++;
            }
        }

        int res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(res, leftZero[i - 1] + rightOne[i]);
        }
        return res;
    }
}