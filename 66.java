public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0 || digits == null)
            return new int[0];
            
        int carry = 1;
        for (int i = digits.length-1; i >= 0; i--) {
            int sum = carry+digits[i];
            
            if (sum < 10)
                carry = 0;
            
            digits[i] = sum%10;
        }
        
        if (carry == 1) {
            int[] result = new int[digits.length+1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0]=1;
            return result;
        }
        else
            return digits;
    }
}

/*
    Another very good solution that eliminates the case by case consideration done above
*/

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] result = new int[digits.length+1];
        result[0] = 1;
        
        return result;
    }
}