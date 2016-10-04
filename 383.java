/*
	Create a hashmap to store characters and their frequencies. Check the same in the ransomNote
*/
	public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap();
        
        char[] arr1 = magazine.toCharArray();
        char[] arr2 = ransomNote.toCharArray();
        char val;
        
        for (int i = 0; i < arr1.length ; i++) {
            val = arr1[i];
            if (map.containsKey(val))
                map.put(val, map.get(val)+1);
            else
                map.put(val, 1);
        }
        
        for (int i = 0; i < arr2.length; i++) {
            val = arr2[i];
            if (!map.containsKey(val))
                return false;
            else {
                map.put(val, map.get(val)-1);
                if (map.get(val) < 0)
                    return false;
            }
        }
        return true;
    }
}