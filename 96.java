/*  
    Logic is that for any node i in n, i-1 nodes are to the left and n-i are to the right. 
    So, number of BSTs for n is t(i-1)*t(n-i)
*/

public class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
 
        dp[0] = 1;
        dp[1] = 1;
     
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = dp[i] + dp[j] * dp[i-j-1];
            }
        }
     
        return dp[n];
    }
}