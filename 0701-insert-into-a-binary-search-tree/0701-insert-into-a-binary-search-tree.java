/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode node = new TreeNode(val);
        TreeNode parent=null;
        TreeNode cur= root;

        if(root==null)
        {
            root=node;
            return root;
        }

        while(cur!=null)
        {
            parent=cur;

            if(cur.val>val)
            cur=cur.left;
            else
            cur=cur.right;
        }

        if(parent.val>val)
        parent.left=node;
        else
        parent.right=node;

        return root;
    }
}