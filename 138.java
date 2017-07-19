/*
    Basic idea is to create a copy of the list while storing all references of the random pointers.
    Once the original list is created, copy all the random pointers into the new one.
*/

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return null;
        
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode head2 = new RandomListNode(head.label);
        
        RandomListNode ptr1 = head;
        RandomListNode ptr2 = head2;
        map.put(head, head2);
        ptr1 = ptr1.next;
        
        
        while (ptr1 != null) {
            RandomListNode temp = new RandomListNode(ptr1.label);
            map.put(ptr1, temp);
            ptr2.next = temp;
            ptr1 = ptr1.next;
            ptr2 = temp;
        }
        
        ptr1 = head;
        ptr2 = head2;
        
        while (ptr1 != null) {
            if (ptr1.random != null) 
                ptr2.random = map.get(ptr1.random);
            else
                ptr2.random = null;
            
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        return head2;
    }
}