/*
	Use a dummy node that points to the head initially. Even if the head then gets deleted, it will 
	return the next node
	Use 2 pointers, one that travels and a temp one
*/

	public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = dummy; 
        
        while (ptr.next != null) {
            if (ptr.next.val == val) {
                ListNode next = ptr.next;
                ptr.next = next.next;
            }
            else {
                ptr = ptr.next;   
            }
        }
        return dummy.next;
    }
}