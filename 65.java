/*
    Neat question. Just need to go step by step.
*/

public class Solution {
    public boolean isNumber(String s) {
        int i = 0;
        int n = s.length();
         
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
         
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            i++;
        }
         
        boolean isNumeric = false;
        
        while (i < n && Character.isDigit(s.charAt(i))) {
            i++;
            isNumeric = true;
        }
         
        if (i < n && s.charAt(i) == '.') {
            i++;
            while (i < n && Character.isDigit(s.charAt(i))) {
                i++;
                isNumeric = true;
            }
        }
         
        if (isNumeric && i < n && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
            i++;
            isNumeric = false;
            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                i++;
            }
            while (i < n && Character.isDigit(s.charAt(i))) {
                i++;
                isNumeric = true;
            }
        }

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
         
        return isNumeric && i == n;
    }
}