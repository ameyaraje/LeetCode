public class Solution {

public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> hm = new HashSet<Integer>();

    for (Integer num: nums) {
        if(hm.add(num) == false)
            return true;
    }
    return false;
    }
}