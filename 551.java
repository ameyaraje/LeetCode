public class Solution {
    public boolean checkRecord(String s) {
        boolean flag = true;
        int aCount = 0;
        int lCount = 0;
        int i = 0;
        
        while (i < s.length()) {
            if (s.charAt(i) == 'L' && i+2 < s.length() && s.charAt(i+1) == 'L' && s.charAt(i+2) == 'L' ) {
                i+= 3;
                lCount++;
            }
            else if (s.charAt(i) == 'A') {
                aCount++;
            }
            i++;
        }   
        
        return aCount <= 1 && lCount == 0;
    }
}