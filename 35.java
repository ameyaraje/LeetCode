public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0 || target == 0)
            return 0;
            
        for (int i = 0; i < nums.length; i++) {
            if (target < nums[i])
                return i;
            if (target == nums[i])
                return i;
        }
        
        if (target > nums[nums.length-1])
            return nums.length;
            
        return 0;
    }
}