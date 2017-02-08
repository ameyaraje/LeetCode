public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp;
        if(root==null)
        return result;
        stack.push(root);
        while (!stack.isEmpty()) {
            temp = stack.pop();
            result.add(temp.val);
            if(temp.left!=null) 
                stack.push(temp.right);
            if(temp.right!=null) 
                stack.push(temp.left);
        }
        return result;
    }
}