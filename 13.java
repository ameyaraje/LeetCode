/*
	Create a hashmap with all integer values and letters instead of 
*/
public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		char preVal = '#';
		
		for (int i = s.length()-1; i >= 0; i--) {
		    char c = s.charAt(i);
		    int val = map.get(c);
		    if (val < result && c != preVal)
		        result = result - val;
		    else
		        result = result + val;
		        
		    preVal = c;
		}
		return result;
    }
}