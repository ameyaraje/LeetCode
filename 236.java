/*
	Recursive Solution
	Compare every node recursively. If conditions arent met, return false
*/
	public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return checkSymmetric(root, root);
    }
    
    public boolean checkSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if(node1 == null || node2 == null) {
            return false;
        }
        else if(node1.val == node2.val && node1 != null && node2 != null) {
            return checkSymmetric(node1.left, node2.right) && checkSymmetric(node1.right, node2.left);
        }
        return false;
    }
}

/*
	Iterative Solution
*/
	