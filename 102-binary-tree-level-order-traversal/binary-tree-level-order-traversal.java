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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result = new ArrayList<>();
       if(root==null){
        return result;
       }
       Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
           int lsize=q.size(); 
           List<Integer> currentLev=new ArrayList<>();
           for (int i = 0; i <lsize; i++) {
                TreeNode current = q.poll();
                currentLev.add(current.val);
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
           }
           result.add(currentLev);
        }
        return result;
    }
}