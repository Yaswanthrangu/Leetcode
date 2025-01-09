class Solution {
    public String destCity(List<List<String>> paths) {
        int n = paths.size();
        for(int i = 0; i < n; i++) {
            boolean flag = true;
            for(int j = 0; j < n; j++) {
                if(paths.get(i).get(1).equals(paths.get(j).get(0))) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                return paths.get(i).get(1);
            }
        }
        return "";
    }
}