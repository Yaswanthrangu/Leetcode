class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int dummy[] = new int[len+2];
        for(int i = 0; i < len; i++) {
            dummy[i+1] = flowerbed[i];
        }
        for(int i = 1; i < dummy.length - 1; i++) {
            if((dummy[i] == 0 && dummy[i-1] == 0) && (dummy[i] == 0 && dummy[i+1] == 0)) {
                dummy[i] = 1; // Important
                n--;
            }
        }
        return n <= 0; // or cnt == n;
    }
}