class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = BST(nums);    
        return root;
    }
    TreeNode BST(int[] nums){
        if(nums.length==0){
            return null;
        }
        int mid = nums.length/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = BST(Arrays.copyOfRange(nums,0,mid));
        node.right = BST(Arrays.copyOfRange(nums,mid+1,nums.length));
        return node;
    }

}
