/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> st = new Stack<TreeNode>();
        List<Integer> l = new ArrayList<Integer>();
        
        while(current != null || !st.isEmpty()) {
            l.add(current.val);
            if (current.right != null) st.push(current.right);
            if (current.left != null) st.push(current.left);
            if (st.isEmpty()) break;
            current = st.pop();
        }
        
        return l;
    }
}
