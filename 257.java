public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        DFS(result, "", root);
        return result;
    }
    
    public void DFS(List<String> result, String path, TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            result.add(path + root.val);
        
        DFS(result, path + root.val+ "->", root.left);
        DFS(result, path + root.val+ "->", root.right);
    }
}