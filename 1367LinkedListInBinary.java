class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        return helper(head,root);
    }
    private boolean helper(ListNode Lnode,TreeNode Tnode){
        if(Tnode==null){
            return false;
        }
        if(Tnode.val == Lnode.val){
            if(checkPath(Lnode,Tnode)){
                return true;
            }
        }
        boolean left = helper(Lnode,Tnode.left);
        if(left){
            return left;
        }
        return helper(Lnode,Tnode.right);
    }
    private boolean checkPath(ListNode Lnode,TreeNode Tnode){

        if(Lnode==null) return true;
        if(Tnode==null) return false;
        
        if(Lnode.val != Tnode.val) return false;
        
        boolean left = checkPath(Lnode.next,Tnode.left);
        if(left){
            return left;
        }
        return checkPath(Lnode.next,Tnode.right);
    }
}
