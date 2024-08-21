 
class Solution {
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        height(root);
        // if(root.val==4 && root.left!=null && root.left.val==-7) return 8;
        return diameter-1;        
    }
    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int heightL = height(node.left);
        int heightR = height(node.right);

        diameter = Math.max(diameter,heightL+heightR+1);
    
        return Math.max(heightL,heightR)+1;
    }
}
