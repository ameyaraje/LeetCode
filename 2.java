/*
	Note: Originally thought method wont work since the reason to keep the number in a LL is so that it can 
	accommodate extremely large values. So using basic math can give stack overflow errors.
*/
/*
	Idea is to extract numbers, add them and a carry (initially 0)
	If ListNode.val==null, use as 0;

*/
	public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode current = new ListNode(0);
            int sum = ((l1 == null? 0: l1.val)) + ((l2 == null? 0: l2.val)) + carry;
            carry = sum/10;
            current.val = sum%10;
            prev.next = current;
            prev = current;
            
            l1 = ((l1 == null? l1: l1.next));
            l2 = ((l2 == null? l2: l2.next));
        }
        return head.next;
    }
}