public class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0)
            return "";
        
        char[] strings = s.toCharArray();
        int j = 0;
        
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == ' ') {
                reverse(strings, j, i-1);
                j = i+1;
            }
        } 
        
        reverse (strings, j, strings.length-1);
            
        return new String(strings);
        
    }
    
    public void reverse(char[] string, int left, int right) {
        while(left < right) {
		    char temp = string[left];
            string[left] = string[right];
            string[right] = temp;
            left++; 
            right--;
	    }
    }
}