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
    TreeNode ans = null;
    private int depth(TreeNode node){
        if(node.left!=null && node.right!=null){
            return 1+Math.max(depth(node.left),depth(node.right));
        }
        if(node.left!=null){
            return depth(node.left)+1;
        }
        if(node.right!=null){
            return depth(node.right)+1;
        }
        return 1;
    }


    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int maxD = depth(root);
        ans = root;
        solve(root,1,maxD);
        return ans;
    }
    private boolean solve(TreeNode node,int d,int maxD){
        if(d==maxD){
            ans = node;
            return true;
        }
        boolean left = false,right = false;
        if(node.left!=null){
            left = solve(node.left,d+1,maxD);
        }
        if(node.right!=null){
            right = solve(node.right,d+1,maxD);
        }
        if(left && right){
            ans = node;
        }
        return left?left:right;

    }
}
