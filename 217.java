public class Solution {

public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<Integer>();

    for (Integer num: nums) {
        if(hm.set(num) == false)
            return true;
    }
    return false;
    }
}