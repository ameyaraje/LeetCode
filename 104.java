/*
	Recursive Method
	Keep calculating left and right subtrees till there are no children
*/
	public class Solution {
    public int maxDepth(TreeNode root) 
    {
        int lDepth = 0;
        int rDepth = 0;
        if (root == null) {
            return 0;
        }
        else {
            lDepth = maxDepth(root.left);
            rDepth = maxDepth(root.right);
            
            if (lDepth > rDepth)
            	return lDepth+1;
            else 
            	return rDepth+1;
        }
    }
}