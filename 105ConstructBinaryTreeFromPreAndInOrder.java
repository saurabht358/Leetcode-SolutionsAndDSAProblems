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
        if(preorder.length==0){
            return null;
        }
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int[] index = {0};
        return helper(preorder,inorder,0,inorder.length-1,map,index);
    }

    private TreeNode helper(int[] pre, int[] in, int left, int right, HashMap<Integer, Integer> map,int[]index) {
        if(left>right){
            return null;
        }
        int current = pre[index[0]];
        index[0]++;
        TreeNode node = new TreeNode(current);
        if(left == right){
            return node;
        }
        int preIndex = map.get(current);

        node.left = helper(pre,in,left,preIndex-1,map,index);
        node.right = helper(pre,in,preIndex+1,right,map,index);
        return node;
    }
}
