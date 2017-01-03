/*
    Two pass solution. Count up frequencies in the first pass, check for the counts in the second pass
*/

public class Solution {
    public int firstUniqChar(String s) {
        int count[] = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1)
                return i;
        }
        
        return -1;
    }
}