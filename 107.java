public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if (root == null) 
            return finalList;
        
        queue.add(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> levelList = new ArrayList<Integer>();
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                levelList.add(node.val);
                
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            finalList.add(levelList);
        }
        
        List<List<Integer>> reversedList = new ArrayList<>();
        for (int i = finalList.size()-1; i >= 0; i--) {
            reversedList.add(finalList.get(i));
        }
        return reversedList;
    }
}