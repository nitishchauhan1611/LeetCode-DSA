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
    public TreeNode sortedArrayToBST(int[] nums) {
      return CreateTree(nums,0,nums.length-1);
    }
    public TreeNode CreateTree(int[] in,int si, int ei)
     {
       if(si>ei)
        {
          return null;
        }
       int mid=(si+ei)/2;
     
       TreeNode nn=new TreeNode();
       nn.val=in[mid];
       nn.left=CreateTree(in,si,mid-1);
       nn.right=CreateTree(in,mid+1,ei);
       return nn;
     
     }

}