class Solution {
    public String largestGoodInteger(String num) {
        int val = -1;
        String ans = "";
        for(int i = 0; i < num.length() - 2; i++) {
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {
                String temp = num.substring(i, i+3);
                if(val < Integer.parseInt(temp)) {
                    val = Integer.parseInt(temp);
                    ans = temp;
                }
            }
        }
        return ans;
    }
}