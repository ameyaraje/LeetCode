/*
    Use 2 pointers.
    Shifting isnt a good idea in the case where all elements are the same as val
*/

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        
        for (j = 0; j < nums.length; j++) {
            if(nums[j] != val){
            nums[i] = nums[j];
            i++; 
            }
        }
    return i;
    }
}