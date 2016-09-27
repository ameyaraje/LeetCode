/*
	PS: Not sure what one pass means here. Both methods are traversing the list twice, just that one traverses it
	partially
*/

/*
	One pass: Use two pointers, slow and fast. Slow stays one behind the fast. 
	The fast goes to the (n-1)th index and then both move ahead to remove the node 
*/

	public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        
        if (fast == null) {
            head = head.next;
            return head;
        }
        
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return head;
    }
}


/*
	Two Pass: Calculate the total length of the list and then remove the (length-n+1)th node from the left
*/
	public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode ptr = head;
        
        while (ptr != null) {
            ptr = ptr.next;
            len++;
        }
        
        int fromStart = len-n+1;
        int i = 0;
        ptr = head;
        
        if (fromStart == 1)
            return head.next;
            
        while (ptr != null) {
            i++;
            if (i == fromStart-1) {
                ptr.next = ptr.next.next;
            }
            ptr = ptr.next;
        }
        return head;
    }
}

