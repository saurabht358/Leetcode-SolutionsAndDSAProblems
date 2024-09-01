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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> ans = inorder(root);
        int i=0,j=ans.size()-1;
        while(i<j){
            int num1 = ans.get(i);
            int num2 = ans.get(j);
            if(num1+num2 == k){
                return true;
            }
            else if(num1+num2 < k){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }   
    private ArrayList<Integer> inorder(TreeNode node){
        ArrayList<Integer> ans = new  ArrayList<>();
        if(node==null){
            return ans;
        }
        ans.addAll(inorder(node.left));
        ans.add(node.val);
        ans.addAll(inorder(node.right));
        return ans;
    }
}
