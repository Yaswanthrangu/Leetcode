class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet <String> st = new HashSet<>();
        for(List<String> path : paths) {
            st.add(path.get(0));
        }
        for(List<String> path : paths) {
            if(!st.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }
}