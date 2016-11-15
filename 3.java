/*
	Brute force solution: Uses a HashSet to check whether the character exists or not. 
	Time: O(n^3) Space: O(n)
*/
	public class Solution {
    	public int lengthOfLongestSubstring(String s) {
        	int len = s.length();
        	int ans = 0;
        	for (int i = 0; i < len; i++)
            	for (int j = i + 1; j <= len; j++)
                	if (checkUnique(s, i, j)) 
                		ans = Math.max(ans, j - i);
        	return ans;
    }

    	public boolean checkUnique(String s, int start, int end) {
        	Set<Character> set = new HashSet<>();
        	for (int i = start; i < end; i++) {
            	if (set.contains(s.charAt(i))) 
            		return false;
            	set.add(ch);
        	}
        	return true;
    	}
	}

/*
	Sliding window method (Reference online)
*/
	public class Solution {
    	public int lengthOfLongestSubstring(String s) {
        	int len = s.length();
        	Set<Character> set = new HashSet<>();
        	int ans = 0, i = 0, j = 0;
        	while (i < len && j < len) {
                if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
           		}
            	else {
                set.remove(s.charAt(i++));
            	}
        	}
        	return ans;
   		}
	}