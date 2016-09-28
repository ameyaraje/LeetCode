/*
	Recursive Solution
	Compare values, if one is smaller, move that list ahead and do the same
*/
	public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        
        if (l2 == null)
            return l1;
            
        if (l1.val > l2.val) {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
        else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
    }
}

/*
	Iterative Solution
	Makes use of a temp node. This will be used to iterate the actual list.
*/