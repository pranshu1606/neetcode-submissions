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
    public boolean isValid(TreeNode node,Long max,Long min){
        if(node==null){
            return true;
        }
        if(min!=null&&node.val<=min){
            return false;
        }
        if(max!=null&&node.val>=max){
            return false;
        }

        return isValid(node.left,(long)node.val,min)&&isValid(node.right,max,(long)node.val);
    }
    public boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return isValid(root,max,min);
    }
}
