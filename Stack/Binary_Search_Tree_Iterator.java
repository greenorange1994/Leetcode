/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
        private TreeNode current = null;
        private Stack<TreeNode> st = null;
    	
        public BSTIterator(TreeNode root) {
            current = root;
            st = new Stack<> ();
    	}
    
    	/** @return whether we have a next smallest number */
    	public boolean hasNext() {		  
            return current != null || !st.isEmpty();
    	}
    
    	    /** @return the next smallest number */
    	public int next() {
            while (current != null) {
                st.push(current);
                current = current.left;
            }
            TreeNode temp = st.pop();
            current = temp.right;
            return temp.val;
    	}
    }
/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
