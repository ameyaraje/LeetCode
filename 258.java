/*  
    Convert int to string representation. Neat trick!
*/

public class Solution {
    public int addDigits(int num) {
        int sum = 0;
        
        String str = String.valueOf(num);
        
        for (int i = 0; i < str.length(); i++) {
            sum += (str.charAt(i) -'0');
        }
        
        if (sum < 10)
            return sum;
        else 
            return addDigits(sum);
            
    }
}