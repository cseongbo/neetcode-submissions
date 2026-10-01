class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> hm = new HashMap<>();


        for (int i = 0; i < strs.length; i++) {

            char[] tmp = new String(strs[i]).toCharArray();
            Arrays.sort(tmp);

            String sorted = new String(tmp);
            
            if (hm.containsKey(sorted)) {
                hm.get(sorted).add(strs[i]);

            } else {
                List<String> al = new ArrayList<>();
                al.add(strs[i]);
                hm.put(sorted, al);
            }

        }

        List<List<String>> answer = new ArrayList<>();

        for (String key : hm.keySet()) {
            answer.add(hm.get(key));
        }

        return answer;
    }
}
