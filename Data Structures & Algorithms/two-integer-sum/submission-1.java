class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length - 1; i++) {
            int num1 = nums[i];
            int needed = target - num1;
            for (int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];

                if (needed == num2) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { 0, 0 };
    }
}
