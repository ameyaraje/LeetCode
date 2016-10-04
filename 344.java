/*
	Use of 2 pointers, since this has to be done in place. 
	while (ptr1 < ptr2) for the lenght of the string, swap characters
*/
	public class Solution {
    public String reverseString(String s) {
        char[] charString = s.toCharArray();
        int i=0;
        int j = s.length()-1;
        while(i<j){
            char temp = charString[i];
            charString[i] = charString[j];
            charString[j] = temp;
            i++;
            j--;
        }
        return new String(charString);
    }
}