class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> st = new HashSet<>();
        for (String str : emails) {
            StringBuilder sb = new StringBuilder();
            boolean ignore = false;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '@') {
                    sb.append(str.substring(i));
                    break;
                }
                if (ignore) {
                    continue;
                }
                if (c == '+') {
                    ignore = true;
                } else if (c != '.') {
                    sb.append(c);
                }
            }
            st.add(sb.toString());
        }
        return st.size();
    }
}