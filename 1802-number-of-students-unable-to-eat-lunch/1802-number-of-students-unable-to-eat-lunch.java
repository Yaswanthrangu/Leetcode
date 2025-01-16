class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zeroCnt = 0;
        int oneCnt = 0;
        for(int ele : students) {
            if(ele == 0) zeroCnt++;
            else oneCnt++;
        }
        for(int i = 0; i < sandwiches.length; i++) {
            if(sandwiches[i] == 0 && zeroCnt == 0) return oneCnt;
            if(sandwiches[i] == 1 && oneCnt == 0) return zeroCnt;
            if(sandwiches[i] == 0) zeroCnt--;
            else oneCnt--;
        }
        return 0;
    }
}