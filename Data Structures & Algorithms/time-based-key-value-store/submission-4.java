class TimeMap {

    Map<String, List<TimeValue>> hm;

    static class TimeValue {
        int timestamp;
        String value;

        TimeValue(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    public TimeMap() {
        hm = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        List<TimeValue> tmp =
            hm.getOrDefault(key, new ArrayList<>());

        tmp.add(new TimeValue(timestamp, value));

        hm.put(key, tmp);
    }

    public String get(String key, int timestamp) {

        if (!hm.containsKey(key)) return "";

        List<TimeValue> al = hm.get(key);

        int left = 0;
        int right = al.size() - 1;
        int ans = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (al.get(mid).timestamp <= timestamp) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (ans == -1) return "";

        return al.get(ans).value;
    }
}