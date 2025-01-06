class MyHashSet {

    private List<Integer> lt;

    public MyHashSet() {
        lt = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!lt.contains(key)) {
            lt.add(key);
        }
    }
    
    public void remove(int key) {
        lt.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return lt.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */