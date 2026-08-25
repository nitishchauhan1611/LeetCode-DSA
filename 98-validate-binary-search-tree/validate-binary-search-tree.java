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
    public boolean isValidBST(TreeNode root) {
        return validBst(root).isbst;
    }
    public BstPair validBst(TreeNode root){
        if(root==null){
            return new BstPair();
        }
        BstPair lbstp = validBst(root.left);
        BstPair rbstp = validBst(root.right);
        BstPair sbstp = new BstPair();
        
        sbstp.min=Math.min(root.val, Math.min(lbstp.min,rbstp.min));
        sbstp.max=Math.max(root.val, Math.max(lbstp.max,rbstp.max));

        sbstp.isbst= lbstp.isbst && rbstp.isbst && root.val>lbstp.max && root.val<rbstp.min;

        return sbstp;
    }
}
class BstPair{
        boolean isbst=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
} 