/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return CommonAncester(root,p,q);
    }
    public TreeNode CommonAncester(TreeNode root, TreeNode p, TreeNode q)
        {
            if(root==null)
               {
                 return null;
               }
            if(root==p || root==q)
               {
                 return root;
               }

            TreeNode left=CommonAncester(root.left,p,q);
            TreeNode right=CommonAncester(root.right,p,q);

            if(left != null && right != null){
                return root;
            }
            else if(left==null){
                return right;
            }
            else{
                return left;
            }
     }
}