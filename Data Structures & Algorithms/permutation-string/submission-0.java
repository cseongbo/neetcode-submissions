class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s2.length() < s1.length()) return false;

        int[] check = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            check[s1.charAt(i) - 'a']++;
        }


        int[] cur = new int[26];

        for (int i = 0; i < s1.length(); i++) cur[s2.charAt(i) - 'a']++;

        if (isPossible(cur, check)) return true;

        for (int i = s1.length(); i < s2.length(); i++) {

            cur[s2.charAt(i - s1.length()) - 'a']--;
            cur[s2.charAt(i) - 'a']++;

            if (isPossible(cur, check)) return true;
        }


        return false;


        
    }

    static boolean isPossible(int[] cur, int[] check) {
        for (int i = 0; i < 26; i++) {
            if (cur[i] != check[i]) return false;
        }

        return true;
    }
}
