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
    public List<Integer> iterate(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        list.addAll(iterate(root.left));
        list.add(root.val);
        list.addAll(iterate(root.right));

        return list;
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list1 = iterate(root);
        Collections.sort(list1);
        return list1.get(k-1);
    }
}
