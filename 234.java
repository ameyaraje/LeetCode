/*
	Method 1: Simple method that uses a stack
	Push all into stack, re-traverse while popping all elements
	Time - O(n)
	Space - O(n)
*/
	public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> nums = new Stack<Integer>();
        ListNode ptr = head;
        while (ptr != null) {
            nums.push(ptr.val);
            ptr = ptr.next;
        }
        ptr = head;
        
        while(nums.empty() == false) {
            int val = nums.pop();
            if (val != ptr.val)
                return false;
            ptr = ptr.next;    
        }
        return true;
    }
}

/*
	
*/