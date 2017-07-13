public class Solution {
    public String reverseStr(String s, int k) {
        if (s == null || s.length() == 0)
            return " ";
        if (k == 0)
            return s;
        
        char[] str = s.toCharArray();
        int i = 0;
        
        while (i < str.length) {
            int j = Math.min(i+k-1, str.length-1);
            reverse(str, i, j);
            i += 2*k;
        }
        
        return new String(str);
        
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