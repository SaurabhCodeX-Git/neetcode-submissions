class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int s : stones) {
            pq.offer(s);
        }

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            int diff = Math.abs(first - second);

            pq.offer(diff);
        }

        return pq.peek();
    }
}
