class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character, Integer> check = new HashMap<>();
        Map<Character, Integer> cur = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            check.put(t.charAt(i), check.getOrDefault(t.charAt(i), 0) + 1);
        }


        int start = 0;
        int end = 0;
        String answer = "";
        int min = Integer.MAX_VALUE;

        while (end < s.length()) {

            
            cur.put(s.charAt(end),
                cur.getOrDefault(s.charAt(end), 0) + 1);

            
            while (isPossible(cur, check)) {

                if (min > end - start + 1) {
                    min = end - start + 1;
                    answer = s.substring(start, end + 1);
                }

                char c = s.charAt(start);
                cur.put(c, cur.get(c) - 1);
                start++;
            }

            end++;
        }

        return answer;

        
        
    }

    static boolean isPossible(Map<Character, Integer> cur, Map<Character, Integer> check) {

        for (char c : check.keySet()) {
            if (!cur.containsKey(c)) return false;

            if (cur.get(c) < check.get(c)) return false;
        }

        return true;

    }
}
