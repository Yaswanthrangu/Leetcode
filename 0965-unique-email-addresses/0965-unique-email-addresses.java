class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> st = new HashSet<>();
        for (String str : emails) {
            String parts[] = str.split("@");
            String local = parts[0];
            local = local.replace(".","");
            local = local.split("\\+")[0];
            String domain = parts[1];
            st.add(local+'@'+domain);
        }
        return st.size();
    }
}