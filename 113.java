/*
	Reference from the internet
	Use DFS recursively. Idea is to reach a leaf node. If not, successively check left and right nodes
*/
	public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> finalValues = new ArrayList<List<Integer>>();
        List<Integer> sumlist = new ArrayList<Integer>();
        
        helper(root, sum, sumlist, finalValues);
        
        return finalValues;
    }
    
    public void helper(TreeNode root, int sum, List<Integer> sumlist, List<List<Integer>> finalValues) {
        
        if (root == null)
            return;
            
        sumlist.add(root.val);
        sum = sum - root.val;
        
        if (root.left == null && root.right == null) {
            if (sum == 0)
                finalValues.add(new ArrayList<Integer>(sumlist));
        }
        else {
            if (root.left != null)
                helper(root.left, sum, sumlist, finalValues);
            if (root.right != null)
                helper(root.right, sum, sumlist, finalValues);
        }
        sumlist.remove(sumlist.size()-1);
    }
}