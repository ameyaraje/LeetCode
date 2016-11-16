/*
    
*/
public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int len = A.length;
        
        if (len < 3)
            return 0;
        
        int ans = 0;
        int count = 0;
        
        int delta = A[1] - A[0];
        
        for (int i = 2; i < len; i++) {
            if (A[i]-A[i-1] == delta) {
                count +=1;
                ans += count;
            }
            else {
                delta = A[i]-A[i-1];
                count = 0;
            }
        }
        
        return ans;
    }
}