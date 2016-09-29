/*
	Check value of root with given nodes
	If greater than both, check in the left subtree
	If less than both, check the right subtree
	else return root
*/
	public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode m = root;
 
    if(m.val > p.val && m.val < q.val) {
        return m;  
    }
    else if(m.val > p.val && m.val > q.val) {
        return lowestCommonAncestor(root.left, p, q);
    }
    else if(m.val < p.val && m.val < q.val) {
        return lowestCommonAncestor(root.right, p, q);
    }
    return root;
    }
}

/*
	Non Iterative
*/
	public class Solution {
		public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
			TreeNode m = root;
			while (true) {
				if (m.val > p.val && m.val > q.val) 
					m = m.left;
				if (m.val < p.val && m.val < q.val) 
					m = m.right;
				else 
					return m;
			}
		}
	}