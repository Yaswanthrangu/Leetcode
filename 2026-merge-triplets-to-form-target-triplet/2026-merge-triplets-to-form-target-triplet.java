class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        HashSet <Integer> st = new HashSet<>();
        // set is used to count the number of equal elements b/w target and other 2 triplets
        // checking every triplet
        for(int triplet[] : triplets) {
            if(triplet[0] > target[0] || triplet[1] > target[1] || triplet[2] > target[2]) {
                continue;
            }
            // if above continue is failed, need to traverse as there is possibility
            // of equality
            for(int i = 0; i < 3; i++) {
                // set is choosen to add bcz there can be same element like target
                // in both triplets
                if(triplet[i] == target[i]) {
                    st.add(i);
                }
            }
        }
        return st.size() == 3; 
    }
}