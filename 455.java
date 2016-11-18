public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        
        Arrays.sort(s);
        Arrays.sort(g);
        
        for (int i = 0; i < s.length && count < g.length; i++) {
            if (g[count] <= s[i])
                count++;
        }
        
        return count;
    }
}