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
