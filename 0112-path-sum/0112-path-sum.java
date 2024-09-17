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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        Stack<TreeNode> curr_node=new Stack();
        Stack<Integer> curr_sum=new Stack();
        curr_node.add(root);
        curr_sum.add(targetSum-root.val);
        while(!curr_node.isEmpty()){
            TreeNode node=curr_node.pop();
            int sum=curr_sum.pop();
            if(node.left==null && node.right==null && sum==0){
                return true;
            }
            if(node.left!=null){
                curr_node.add(node.left);
                curr_sum.add(sum-node.left.val);
            }
            if(node.right!=null){
                curr_node.add(node.right);
                curr_sum.add(sum-node.right.val);
            }
        }
        return false;
    }
}