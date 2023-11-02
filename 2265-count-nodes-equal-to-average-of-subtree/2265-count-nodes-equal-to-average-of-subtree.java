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
class Tree{
    int ans;
    int count;
    int sum;
    Tree(int count,int sum,int ans)
    {
        count=this.count;
        sum=this.sum;
        ans=this.ans;
    }
}
class Solution {
    public int averageOfSubtree(TreeNode root) {
       Tree ans = findSum(root);
       return ans.ans;
    }

    public Tree findSum(TreeNode root)
    {
        if(root==null)
        return new Tree(0,0,0);

        Tree l = findSum(root.left);
        Tree r = findSum(root.right);

        Tree newnode=new Tree(0,0,0);
        newnode.count=l.count+r.count+1;
        newnode.sum=l.sum+r.sum+root.val;

        if(newnode.sum/newnode.count == root.val)
        newnode.ans=l.ans+r.ans+1;
        else
        newnode.ans=l.ans+r.ans;

        return newnode;
    }
}
