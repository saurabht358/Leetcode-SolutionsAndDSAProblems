public int kthSmallest(TreeNode root, int k) {
        this.count = k;
        helper(root);
        return ans;
    }
    int count = 0;
    int ans;
    private void helper(TreeNode node){
        if(node==null){
            return;
        }
        helper(node.left);
        count--;
        if(count==0){
            ans = node.val;
            return;
        } 

        helper(node.right);
    }
