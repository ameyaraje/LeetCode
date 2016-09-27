/*
	Iterative solution
	Use 2 pointers and a temp variable.
*/
	public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
            
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        ListNode temp;
        head.next = null;
        
        while (ptr1 != null && ptr2 != null) {
            temp = ptr2.next;
            ptr2.next = ptr1;
            ptr1 = ptr2;
            ptr2 = temp;
        }
        return ptr1;
    }
}

