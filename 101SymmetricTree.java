class Solution {
    public boolean isSymmetric(TreeNode root) {
         return isSame(root.left,root.right);
    }
    boolean isSame(TreeNode node1,TreeNode node2){
        if((node1==null && node2!=null) || node2==null && node1!=null){
            return false;
        }
        if(node1==null && node2==null) return true;
        if(node1.val != node2.val){
            return false;
        }
        boolean lsame = isSame(node1.left,node2.right);
        if(lsame==false){
            return false;
        }
        return isSame(node1.right,node2.left);
    }
    
}
