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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);

        int sd = Height(root.left) + Height(root.right) + 2;
        return Math.max(rightDia, Math.max(leftDia, sd));
    }

    public int Height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int left = Height(root.left);
        int right = Height(root.right);
        return Math.max(left, right) + 1;
    }
}