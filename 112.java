public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root != null && root.val == sum && root.left == null && root.right == null)
            return true;
        else if (root == null)
            return false;
        else 
            return (hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val));
    }
}