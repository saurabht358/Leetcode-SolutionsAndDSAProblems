class Solution {
    int[]seg;
    public ArrayList<Integer> rangeMinQuery(int[] arr, int[][] queries) {
         int n = arr.length;
         seg = new int[n*4];
        
        buildTree(arr,0,0,n-1);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int []q:queries){
            ans.add(getMin(0,0,n-1,q[0],q[1]));
        }
        return ans;
        
    }
    int getMin(int ind,int l,int r,int start,int end){
        if(l>end || r<start)return Integer.MAX_VALUE;
        if(start<=l && end>=r)return seg[ind];
        int m = (l+r)/2;
        int minl = getMin(ind*2+1,l,m,start,end);
        int minr = getMin(ind*2+2,m+1,r,start,end);
        return  Math.min(minl,minr);
         
    }
    
    void buildTree(int[]arr,int ind,int l,int r){
        
        if(l==r){
            seg[ind] = arr[l];
            return ;
        }
        
        int mid = l+(r-l)/2;
        
        buildTree(arr,ind*2+1,l,mid);
        buildTree(arr,ind*2+2,mid+1,r);
        seg[ind] = Math.min(seg[ind*2+1],seg[ind*2+2]);
        
         
    }
}
