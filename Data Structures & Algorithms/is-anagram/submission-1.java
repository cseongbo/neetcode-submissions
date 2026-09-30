class Solution {
    public boolean isAnagram(String s, String t) {

        int[] sArr = new int[26];
        int[] tArr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
           
            sArr[sChar - 'a']++;
            
        }

        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            tArr[tChar - 'a']++;
        }

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) return false;
        }


        return true;
    }
}
