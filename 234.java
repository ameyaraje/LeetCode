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

public class Solution {
    public boolean isPalindrome(ListNode head) {
       if (head == null || head.next == null) {
           return true;
       }
       
       if (head.val == head.next.val)
        return true;
       
       ListNode mid = findMiddle(head);
       System.out.println("Mid is " + mid.val);
       mid.next = reverse(mid);
       
       ListNode ptr1 = head;
       ListNode ptr2 = mid.next;
       
       while (ptr1 != null && ptr2 != null && ptr1.val == ptr2.val) {
           ptr1 = ptr1.next;
           ptr2 = ptr2.next;
       }
       return ptr2 == null;
    }
    
    public ListNode findMiddle(ListNode head) {
        if (head == null) 
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head) {
        if (head == null)
            return head;
        
        ListNode prev = null;
        ListNode temp;
        
        while(head != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}