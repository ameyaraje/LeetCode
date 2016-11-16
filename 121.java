/*
    Scan from left to right and keep tabs on the difference of the current value and the minimum
    value.
*/

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1)
            return 0;
        
        int diff = 0; int max = 0;
        int minV = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minV)
                minV = prices[i];
            diff = prices[i] - minV;
            if (max < diff)
                max = diff;
        }
        
        return max;
    }
}