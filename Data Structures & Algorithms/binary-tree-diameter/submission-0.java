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
    int dia =0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        height(root);
        return dia;
    }

    private int height(TreeNode root){
        if (root == null) {
            return 0;
        }
        int leftLength =  height(root.left);
        int rightLength = height(root.right);
        
        dia = Math.max(dia, leftLength+rightLength);
        return 1+Math.max(leftLength, rightLength);
    }
}
