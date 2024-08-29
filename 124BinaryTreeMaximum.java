 
class Solution {
    public int maxPathSum(TreeNode root) {
        if(root!=null){
            maxSum=root.val;
        }
        helper(root);
    
        return maxSum;
    }
    int maxSum =0;
    int helper(TreeNode node){
        if(node==null){
            return 0;
        }
        
        if(node.left==null && node.right==null){
            maxSum = Math.max(node.val,maxSum);
            return node.val;
        }

        int left= helper(node.left);
        
        int right = helper(node.right);

        if(left<0) left = 0;
        if(right<0) right = 0;
        
        maxSum = Math.max(left+right+node.val,maxSum);
         

        return Math.max(left+node.val,right+node.val);
    }
}
