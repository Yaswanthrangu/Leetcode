class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack <Integer> sandwichType = new Stack<>();
        Queue <Integer> studentLikes = new LinkedList<>();
        for(int i = 0; i < students.length; i++) {
            studentLikes.add(students[i]);
            sandwichType.push(sandwiches[(sandwiches.length-1) - i]);
        }
        int studentMissed = 0;
        while(!studentLikes.isEmpty()) {
            if(studentLikes.peek() == sandwichType.peek()) {
                studentLikes.poll();
                sandwichType.pop();
                studentMissed = 0;
            }
            else {
                studentMissed++;
                studentLikes.add(studentLikes.poll());
                if(studentMissed == studentLikes.size()) {
                    break;
                }
            }
        }
        return studentMissed;
    }
}