
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();

        int len = nums.length;

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        if (hs.size() == len) {
            return false;
        } else return true;

    }
}