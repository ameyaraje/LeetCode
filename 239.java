public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        
        if (k < 1 || nums.length == 0) {
            return new int[0];
        }
        else {
          for (int i = 0; i <= nums.length-k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j <= i+k-1; j++) {
                if (nums[j] >= max) 
                    max = nums[j];
                
            }
            result[i] = max;
        }
        return result;  
        }
    }
}