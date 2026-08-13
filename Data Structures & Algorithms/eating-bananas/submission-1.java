class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1, hi = 0;

        // find max bananas in piles
        for (int pile : piles) {
            hi = Math.max(hi, pile);
        }

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (canEat(mid, h, piles)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private static boolean canEat(int bananas, int hours, int[] piles) {
        int currentHours = 0;

        for (int pile : piles) {
            currentHours += (pile + bananas - 1) / bananas;

            if (currentHours > hours) {
                return false;
            }
        }

        return currentHours <= hours;
    }
}
