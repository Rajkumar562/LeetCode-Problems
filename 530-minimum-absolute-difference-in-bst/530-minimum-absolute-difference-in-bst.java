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
    List<Integer> arr=new ArrayList<>();
    
    public void makeArray(TreeNode root)
    {
        if(root == null)
            return;
        
        makeArray(root.left);
        arr.add(root.val);
        makeArray(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        makeArray(root);
        int min=Integer.MAX_VALUE;
        
        for(int i=1;i<arr.size();i++)
        {
            int dif=arr.get(i)-arr.get(i-1);
            if(dif<min)
                min=dif;
        }
        return min;
    }
}