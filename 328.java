/*
    Storing the bridge somewhere is important
*/

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return head;
            
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        ListNode bridge = head.next;
        
        while (ptr1 != null && ptr2 != null && ptr2.next != null) {
            ptr1.next = ptr2.next;
            ptr1 = ptr1.next;

            ptr2.next = ptr1.next;
            ptr2 = ptr2.next;
        }
        ptr1.next = bridge;
        return head;
    }
}