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
    static int maxSum = Integer.MIN_VALUE;
    public int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftGain = Math.max(helper(root.left),0); 
        int rightGain = Math.max(helper(root.right),0);
        maxSum = Math.max(maxSum,root.val+leftGain+rightGain);
        return root.val+Math.max(leftGain,rightGain);
    }
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        helper(root);
        return maxSum;
    }
}