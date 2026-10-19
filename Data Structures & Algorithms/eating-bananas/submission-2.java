class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        long s = 1, e = 1000000001;

        long min = Long.MAX_VALUE;

        while (s <= e) {

            long mid = (s + e) / 2;

            long time = 0;
            for (int i = 0; i < piles.length; i++) {
                time += piles[i] / mid;
                if ((piles[i] % mid) != 0) time += 1;
            }

            if (time <= h) {
                min = Math.min(min, mid);
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            // 300000000

        }

        return (int) min;
        
    }
}
