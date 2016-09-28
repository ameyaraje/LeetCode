/*
	Create a hashet. Assumes that all nodes are unique
*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        HashSet<ListNode> set = new HashSet<>();
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while(!set.contains(headB) && headB != null){
            headB = headB.next;
        }
        if(headB != null)return headB;
        return null;
    }
}

/*
	Method 2: Calculate lengths, then move the shorter one ahead by 'difference' places
	Keep checking values for place of intersection
*/
	public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null)
            return null;
        
        ListNode ptr1 = headA, ptr2 = headB;
        int len1 = 0, len2 = 0, diff;
        
        len1 = getLength(headA);
        len2 = getLength(headB);

        if (len1 > len2) {
            diff = len1-len2;
            while (diff != 0) {
                ptr1 = ptr1.next;
                diff--;
            }
        }
        else if (len1 < len2) {
            diff = len2-len1;
            while (diff != 0) {
                ptr2 = ptr2.next;
                diff--;
            }
        }
        
        
        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val == ptr2.val) {
                return ptr1;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return null;  
    }
    
    public int getLength(ListNode ptr) {
        int len = 0;
        
        while(ptr != null) {
            len++;
            ptr = ptr.next;
            
        }
        
        return len;
    }
}