class Solution {
    public int[] productExceptSelf(int[] nums) {

        int totalProduct = 1;
        int max = 1;
        int zero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                totalProduct *= nums[i];
                zero++;
                continue;
            }
            totalProduct *= nums[i];
            max *= nums[i];
        }

        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) answer[i] = max;
            else {
                answer[i] = totalProduct / nums[i];
            }
            
        }

        if (zero >= 2) {
            for (int i = 0; i < answer.length; i++) answer[i] = 0;
        }

        return answer;
        
    }
}  
