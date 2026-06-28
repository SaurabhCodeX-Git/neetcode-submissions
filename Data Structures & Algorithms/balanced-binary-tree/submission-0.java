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
        
        if(root == null) return true;

        int lh = depth(root.left);
        int rh = depth(root.right);

        if(Math.abs(lh-rh) <= 1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }else{
            return false;
        }

        

    }

    private static int depth(TreeNode root){

            if(root == null){
                return 0;
            }

            return 1+Math.max(depth(root.left), depth(root.right));

        }
}
