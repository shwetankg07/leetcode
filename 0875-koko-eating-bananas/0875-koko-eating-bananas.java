class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = 0;
        int ans = 0;
        for (int i : piles) {
            if (i > high) {
                high = i;
            }
        }
        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (candoit(piles, h, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean candoit(int[] A, int B, int k) {
        long totalhours = 0;
        for (int i : A) {
            totalhours += (i + k - 1) / k;
        }
        return totalhours <= B;
    }
}