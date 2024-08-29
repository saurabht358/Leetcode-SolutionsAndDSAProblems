class Solution {
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        return helper(root,0);
    }
    int helper(TreeNode node,int sum){
        if(node==null){
            return sum;
        }
        if(node.left==null && node.right==null){
            return (sum*10)+node.val;
        }

        int left=0;
        if(node.left!=null){
            left= helper(node.left,sum*10+node.val);
        }
        int right = 0;
        if(node.right!=null){
            right = helper(node.right,sum*10+node.val);
        }
        return left+right;
    }
     
}
