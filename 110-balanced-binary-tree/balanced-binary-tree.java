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
    public boolean isBalanced(TreeNode root) {
        return balance(root).isbalance;
    }

    
    public BalancePair balance(TreeNode root) {
        if (root == null) {
            return new BalancePair();
        }

        
        BalancePair lbp = balance(root.left);
        BalancePair rbp = balance(root.right);

        BalancePair sbp = new BalancePair();
        sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;

        boolean sb = Math.abs(lbp.ht - rbp.ht) <= 1;
        sbp.isbalance = lbp.isbalance && rbp.isbalance && sb;

        return sbp;
    }

    class BalancePair {
        int ht = -1;
        boolean isbalance = true;
    }
}