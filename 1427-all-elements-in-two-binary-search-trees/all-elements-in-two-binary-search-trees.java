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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
       List<Integer> ans=new ArrayList<>();
       preOrder1(root1,ans);
       preOrder2(root2,ans); 
       Collections.sort(ans);
       return ans;
    }
    public void preOrder1(TreeNode root1,List<Integer> ans){
        if(root1==null){
            return;
        }
        ans.add(root1.val);
        preOrder1(root1.left,ans);
        preOrder1(root1.right,ans);
    }
    public void preOrder2(TreeNode root2,List<Integer> ans){
        if(root2==null){
            return;
        }
        ans.add(root2.val);
        preOrder2(root2.left,ans);
        preOrder2(root2.right,ans);
    }
}