class Solution {
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> ans = preOrder(root);
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            return;
        }
        TreeNode temp = root;
        for(int i=0;i<ans.size();i++){
            temp.right = ans.get(i); 
            temp.left = null;
            temp = temp.right;
        }

        if(root!=null)
            root = root.right;
         
    }
    ArrayList<TreeNode> preOrder(TreeNode node){
        ArrayList<TreeNode> ans = new ArrayList<>();
        if(node==null){
            return ans;
        }
        
        ans.add(node); 
        ans.addAll(preOrder(node.left));
        ans.addAll(preOrder(node.right));
        return ans;
    }

}



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
    public void flatten(TreeNode root) {
        TreeNode current = root;
        if(root==null){
            return;
        }
        while(current!=null){
            if(current.left!=null){
                TreeNode temp = current.left;
                while(temp.right!=null){
                    temp = temp.right;
                }

                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current =  current.right;
        }
    }
}
