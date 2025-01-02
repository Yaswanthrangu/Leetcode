class Solution {
    public int lengthOfLastWord(String s) {
        String t[] = s.split(" ");
        String t1 = t[t.length-1];
        return t1.length();
    }
}