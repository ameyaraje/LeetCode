class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            
            root = stack.pop();
            if (prev != null && prev.val >= root.val) 
                return false;
            
            prev = root;
            root = root.right;
        }
        
        return true;
    }
}