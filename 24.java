/*
    DONT FRIGGING EXCHANGE NODES THEMSELVES
*/

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
            
        ListNode ptr = head;
        
        while (ptr != null && ptr.next != null) {
            //swap
            int temp = ptr.val;
            ptr.val = ptr.next.val;
            ptr.next.val = temp;
            ptr = ptr.next.next;
        }
        
        return head;
    }
}