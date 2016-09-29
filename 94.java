/*
	Recursive Solution
	Straightforward. 
*/
	public class Solution {
		public List<Integer> inorderTraversal(TreeNode root) {
			List<Integer> result = new ArrayList<Integer>();

			if (root.left != null) {
				result.add(inorderTraversal(root.left));
			}
			if (root.right != null) {
				result.add(inorderTraversal(root.right));
			}
			return result;
		}
	}


/*
	Iterative Solution:
	*Requires auxillary space to store nodes as they're traversed
	Go to leftmost node of tree. Then print it and pop. Check if right exists. Repeat till stack is empty (since
	it contains all nodes)
*/
  
  public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        TreeNode temp = root;
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        while(temp != null || !stack1.isEmpty()) {
            while(temp != null) {
            stack1.push(temp);
            temp = temp.left;
        }
        temp = stack1.pop();
        result.add(temp.val);
        temp = temp.right;
        }
        return result;
    }
}