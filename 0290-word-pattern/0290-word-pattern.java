class Solution {
    public boolean wordPattern(String pattern, String s) {
        char arr1[] = pattern.toCharArray();
        String arr2[] = s.split(" ");
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(n1 != n2) {
            return false;
        }
        HashMap <Character, String> mp = new HashMap<>();
        for(int i = 0; i < n1; i++) {
            if(!mp.containsKey(arr1[i])) {
                if(mp.containsValue(arr2[i])) {
                    return false;
                }
                mp.put(arr1[i], arr2[i]);
            }
            else {
                if(!mp.get(arr1[i]).equals(arr2[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}