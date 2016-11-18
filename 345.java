public class Solution {
    public String reverseVowels(String s) {
        char[] ss = s.toCharArray();
        int i = 0;
        int j = ss.length - 1;
        
        while (i < j) {
            if (isVowel(ss[i]) && isVowel(ss[j])) {
                char temp = ss[i];
                ss[i] = ss[j];
                ss[j] = temp;
                i++;
                j--;
            }
            else if (!isVowel(ss[i]) && isVowel(ss[j])) {
                i++;
            }
            else if (isVowel(ss[i]) && !isVowel(ss[j])) {
                j--;
            }
            else {
                i++;
                j--;
            }
        }
        
        return new String(ss);
    }
    
    public boolean isVowel(char x) {
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
            return true;
        
        return false;
    }
}