/*
    One pass isnt possible
*/

public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int noOfNodes = getCount(root.left);
        
        if (k <= noOfNodes) {
            return kthSmallest(root.left, k);
        }
        else if (k > noOfNodes+1) {
            return kthSmallest(root.right, k-1-noOfNodes);
        }
        
        return root.val;
    }
    
    public int getCount(TreeNode node) {
        if (node == null)
            return 0;
        
        return getCount(node.left) + getCount(node.right) + 1;
    }
}