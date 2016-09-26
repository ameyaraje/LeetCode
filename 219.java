public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 0) {
            return false;
        }
            
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer last = map.put(nums[i], i);
            if (last != null && Integer.valueOf(last) >= i-k) {
                return true;
            }
        }
        return false;
    }
}