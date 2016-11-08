/*
    First calculate the length of the shortest string. Then iterate only over those characters
    Substring is a good idea, no need of StringBuilder
*/

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        
        if (strs.length == 1) 
            return strs[0];
        
        int leastLen = Integer.MAX_VALUE;
        
        for (String str: strs) {
            if (leastLen > str.length())
                leastLen = str.length();
        }
        
        for (int i = 0; i < leastLen; i++) {
            for (int j = 0; j < strs.length-1; j++) {
                String str1 = strs[j];
                String str2 = strs[j+1];
                if (str1.charAt(i) == str2.charAt(i)) {
                    return str1.substring(0, i);
                }
            }
        }
        return strs[0].substring(0, leastLen);
    }
}