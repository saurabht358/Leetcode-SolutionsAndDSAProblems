class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    void invert(TreeNode node){
        if(node==null){
            return;
        }
        TreeNode t = node.left;
        node.left = node.right;
        node.right = t;

        invert(node.left);
        invert(node.right);
    }
}
