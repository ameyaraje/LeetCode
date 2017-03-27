public class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (set.contains(c)) {
                set.remove(c);
                count++;
            }
            else
                set.add(c);
        }
        
        if (!set.isEmpty()) 
            return 2*count +1;
        
        return 2*count;
    }
}