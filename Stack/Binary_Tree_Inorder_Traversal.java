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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> st = new Stack<TreeNode>();
        List<Integer> l = new ArrayList<Integer>();
        
        while(current != null || !st.isEmpty()) {
            while (current != null) {
                st.push(current);
                current = current.left;
            }
            current = st.pop();
            l.add(current.val);
            current = current.right;
        }
        
        return l;
    }
}
