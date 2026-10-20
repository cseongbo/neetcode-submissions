class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        Set<Character> hs = new HashSet<>();

        int i = 0, j = 0;
       

        int answer = 0;
        while (j < s.length()) {

            if (!hs.contains(s.charAt(j))) {
                hs.add(s.charAt(j));
                j++;
                answer = Math.max(answer, hs.size());
            } else {

                hs.remove(s.charAt(i));
                i++;

            }

        }

        return answer;

        
    }
}
