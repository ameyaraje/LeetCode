/*
	Works obviously only when majority is n/2 occurences
*/
public class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}


class Solution {
    public int majorityElement(int[] num) {
        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
}