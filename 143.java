/*
    Trick is to break the LL into 2 halves and then merge them
*/

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) 
            return;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head2 = slow.next;
        slow.next = null;
        
        head2 = reverseList(head2);
        
        ListNode ptr1 = head;
        ListNode ptr2 = head2;
        
        while (ptr2 != null) {
            ListNode temp1 = ptr1.next;
            ListNode temp2 = ptr2.next;
            
            ptr1.next = ptr2;
            ptr2.next = temp1;
            
            ptr1 = temp1;
            ptr2 = temp2;
            
        }
    }
    
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode prev = null;
        
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}