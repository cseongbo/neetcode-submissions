class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return b[1] - a[1];
        });

        for (int key : hm.keySet()) {
            pq.add(new int[] { key, hm.get(key) });
        }

        int[] answer = new int[k];

        for (int i = 0; i < k; i++) {
            answer[i] = pq.poll()[0];
        }

        return answer;
    }
}
