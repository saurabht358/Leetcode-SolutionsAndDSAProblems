class Solution {
    int[] seg;
    List<Integer> querySum(int n, int arr[], int q, int queries[]) {
        // code here
        seg = new int[n*4];
        buildTree(arr,0,0,n-1);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<q;i++){
            int res = getSum(0,0,n-1,queries[2*i]-1,queries[2*i+1]-1);
            ans.add(res);
        }
        return ans;
        
    }
    int getSum(int ind,int l,int r,int start,int end){
        
        if(l>end || r<start)return 0;
        if(l>=start && r<=end)return seg[ind];
        
        
        
        int mid= l + (r-l)/2;
        int left = 2*ind+1;
        int right = 2*ind+2;
        
        return getSum(left,l,mid,start,end)+getSum(right,mid+1,r,start,end);
        
        
    }
    void buildTree(int[]arr,int ind,int l,int r){
        
        if(l==r){
            seg[ind] = arr[l];
            return ;
        }
        
        int mid = l+(r-l)/2;
        
        buildTree(arr,ind*2+1,l,mid);
        buildTree(arr,ind*2+2,mid+1,r);
        seg[ind] = seg[ind*2+1]+seg[ind*2+2];
        
         
    }
}
