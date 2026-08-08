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
    int visited=-1;
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> result=new ArrayList<>();
       view(root,0,result);
       return result; 
    }
    public void view(TreeNode root, int current,List<Integer>ll){
        if(root==null){
            return;
        }
        if(current>visited){
            ll.add(root.val);
            visited=current;
        }
        view(root.right,current+1,ll);
        view(root.left,current+1, ll);
    }
}