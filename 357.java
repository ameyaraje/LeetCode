/*
    Interesting solution
    For i = 1: Unique digits = 10
    For i = 2: 9 (from 1-9) * 9 (for 2nd digit; from 0-9, excluding the repeated one) excluding the 1 digit ones
    For i = 3: 9*9*8 (doubles excluded) and excluding double and single digit numbers
    For i = n: 9*9*8*.. = 9-i+2
*/
public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int[] nums = new int[n+1];
        nums[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            nums[i] = 9;
            for (int j = 9; j >= 9-i+2; j--) {
                nums[i] = nums[i]*j;
            }
        }
        int ans = 0;
        for (int x: nums)
            ans +=x;
            
        return ans;    
    }
}