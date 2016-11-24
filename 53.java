public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) 
            return nums[0];
        
        int max = nums[0];
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            sum[i] = Math.max(nums[i], sum[i-1] + nums[i]);
            max = Math.max(max, sum[i]);
        }
        
        return max;
    }
}