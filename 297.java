public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "";
        
        StringBuffer sb = new StringBuffer();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp != null) {
                sb.append(String.valueOf(temp.val)+",");
                queue.add(temp.left);
                queue.add(temp.right);
            }
            else {
                sb.append("#,");
            }
        }
        
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString(); 
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) 
            return null;
        
        String[] arr = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(root);
        
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            
            if (temp == null) {
                continue;
            }
            
            if (!arr[i].equals("#")) {
                temp.left = new TreeNode(Integer.parseInt(arr[i]));
                queue.offer(temp.left);
            }
            else {
                temp.left = null;
                queue.offer(null);
            }
            i++;
            
            if (!arr[i].equals("#")) {
                temp.right = new TreeNode(Integer.parseInt(arr[i]));
                queue.offer(temp.right);
            }
            else {
                temp.right = null;
                queue.offer(null);
            }
            i++;
        }
        
        return root;
    }
}