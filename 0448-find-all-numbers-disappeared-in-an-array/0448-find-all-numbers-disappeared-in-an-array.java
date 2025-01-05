class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> store = new HashSet<>();
        for (int i = 1; i <= n; i++) store.add(i);
        
        for (int num : nums) {
            store.remove(num);
        }
        
        return new ArrayList<>(store);
    }
}