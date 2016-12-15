/*
    Recursive solution: Do a binary search on a section after checking if the rotation occurred or not for the minimum element. 
*/

public class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
            
        return findMin(nums, 0, nums.length - 1);
    }
    
    public int findMin(int[] nums,int start,int end) {
        if (start == end) 
            return nums[start];
        
        if (end - start == 1)
            return Math.min(nums[start], nums[end]);
            
        int mid = start + (end-start)/2;
        
        if (nums[start] < nums[end])
            return nums[start];
            
        else if (nums[mid] > nums[start])
            return findMin(nums, mid, end);
        
        else
            return findMin(nums, start, mid);
    } 
}