public class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int l = nums.length;
        
        if (l == 0)
            return;
        else {
            for (int i = 0; i < l; i++) {
                if (nums[i] != 0) {
                nums[count++] = nums[i];
                }
            }
            for (int i = count; i < l; i++) {
                nums[i] = 0;
            }
        }
    }
}