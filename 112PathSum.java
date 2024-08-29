//Solution 1
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null && targetSum!=0){
            return false;
        }
        return helper(root,targetSum,0);
    }
    private boolean helper(TreeNode node,int tSum,int sum){
        if(node==null){
            return false;
        }
        sum+= node.val;
        if(leafNode(node)){
            if(tSum==sum){
                return true;
            }else return false;
        }
        boolean left=false;
        if(node.left!=null){
            left = helper(node.left,tSum,sum);
        }
        if(left){
            return left;
        }
        return helper(node.right,tSum,sum);

    }
    private boolean leafNode(TreeNode node){
        if(node==null){
            return false;
        }
        if(node.left==null && node.right==null){
            return true;
        }
        return false;
    }
}
// Solution 2

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null && targetSum!=0){
            return false;
        }
        if(root==null ){
            return false;
        }
        return helper(root,targetSum);
    }
    private boolean helper(TreeNode node,int required){
        if(required == node.val && leafNode(node)){
            return true;
        }
        if(leafNode(node)){
            if(node.val!=required) return false;
            else return true;
        }
        boolean left = false;
        if(node.left!=null){
            left = helper(node.left,required-node.val);
        }
        if(left){
            return left;
        }
        if(node.right!=null){
            return helper(node.right,required-node.val);
        }
        return left;
    }
    private boolean leafNode(TreeNode node){
        if(node==null){
            return false;
        }
        if(node.left==null && node.right==null){
            return true;
        }
        return false;
    }
}
