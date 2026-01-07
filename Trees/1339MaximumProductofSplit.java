
class Solution {
    long ans = -1;
    long total; //store total sum globally
    int M = (int)1e9+7;
    public int maxProduct(TreeNode root) {
         
        total = dfsSum(root); // calculate total sum using dfs
        dfs(root); // apply post-order dfs  
        return (int)(ans%M); 

    }
    public long dfs(TreeNode node){
        long left = 0;
        long right =0;
        if(node.left!=null){
            left = dfs(node.left);
        }
        if(node.right!=null){
            right = dfs(node.right);
        }
        //removed the edge from its parent 
        long t = left+right+node.val;
        long prod = t*(total-t);
         
        
        ans = Math.max(ans,t*(total-t));
        return t;

    }
    private long dfsSum(TreeNode node){
        long sum = node.val;
        if(node.left!=null){
            sum+= dfsSum(node.left);
        }

        if(node.right!=null){
            sum+= dfsSum(node.right);
        }
        return sum;
    }

}
