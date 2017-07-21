public class Solution {
    public int reverse(int x) {
        boolean sign;
        int p = Math.abs(x);
        int result = 0;
        
        sign = x < 0 ? true : false;
        
        while (p > 0) {
            int mod = p%10;
            p = p/10;
            result = result*10 + mod;
        }
        if (sign) 
            result *= -1;
        
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;
        else
            return result;
    }
}