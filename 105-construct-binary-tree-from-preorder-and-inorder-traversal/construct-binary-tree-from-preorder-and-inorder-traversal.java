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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return CreateTree(preorder,inorder,0,inorder.length-1,0,preorder.length-1);
    }
    public TreeNode CreateTree(int[] pre, int[] in, int inlow , int inhig, int prlow, int prhig){
        if(inlow>inhig || prlow>prhig){
            return null;
        }
       TreeNode node = new TreeNode(pre[prlow]);
       int idx=search(in,inlow,inhig,pre[prlow]);
       int netI=idx-inlow;
       node.left=CreateTree(pre,in,inlow,idx-1,prlow+1,prlow+netI);
       node.right=CreateTree(pre,in,idx+1,inhig,prlow+netI+1,prhig);
       return node;

    }
    public int search(int[] in, int si, int ei ,int item){
      for(int i=si; i<=ei ;i++){
         if(in[i]==item){
            return i;
         }
        }
      return 0;  
    }
}