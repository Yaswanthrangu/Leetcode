class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> mp = new HashMap<>();
        for (List<String> p : paths) {
            mp.put(p.get(0), p.get(1));
        }

        String start = paths.get(0).get(0);
        while (mp.containsKey(start)) {
            start = mp.get(start);
        }
        return start;
    }
}