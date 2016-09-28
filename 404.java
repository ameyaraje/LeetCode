/*
	Iterate through all nodes, checking if it is a leaf or not
	If it is, add value of left
*/
	public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        
        int sum = 0;
        
        if (isLeaf(root.left))
            sum = sum + root.left.val;
        else
            sum = sum + sumOfLeftLeaves(root.left);
            
        sum = sum + sumOfLeftLeaves(root.right);
        
        return sum;
        
    }
    
    public boolean isLeaf(TreeNode node) {
        if (node == null)
            return false;
        if (node.left == null && node.right == null)
            return true;
            
        return false;
    }
}