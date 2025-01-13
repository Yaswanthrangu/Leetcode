class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<String> visited = new HashSet<>();
        visited.add(x + "," + y);
        
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch == 'N') y++;
            else if (ch == 'S') y--;
            else if (ch == 'E') x++;
            else if (ch == 'W') x--;
            
            String position = x + "," + y;
            if (visited.contains(position)) {
                return true;
            }
            visited.add(position);
        }
        return false;
    }
}