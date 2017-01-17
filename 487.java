public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int max = 0;
        int ones = 0;
        int length = 0;
        
        for (int x: nums) {
            if (x == 1) {
                ones++;
                length++;
            }
            else {
                length = ones+1;
                ones = 0;
            }
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}