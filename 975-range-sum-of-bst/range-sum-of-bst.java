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
    public int rangeSumBST(TreeNode root, int low, int high) {
      return Find(root,low,high);  
    }
    public int Find(TreeNode root,  int low, int high){
        int sum=0;
        if(root==null){
            return 0;
        }
        if(root.val>= low && root.val <= high){
            sum += root.val;
        }
        sum += Find(root.left,low,high);
        sum += Find(root.right,low,high);
        
        return sum;
    }
}