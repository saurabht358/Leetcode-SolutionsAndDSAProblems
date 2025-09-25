class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size(),k=1;
        int l = n*(n+1)/2;
        if(n==1)return t.get(0).get(0);
        int arr[] = new int[l];
        arr[0] = t.get(0).get(0);
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                int val = t.get(i).get(j);
                if(j==0){
                    int ind = findIndex(i-1,j);
                    arr[k] = val + arr[ind];
                }else if(j==i){
                    int ind = findIndex(i-1,j-1);
                    arr[k] = val + arr[ind];
                }else{
                    arr[k] = val+ Math.min(arr[findIndex(i-1,j-1)],arr[findIndex(i-1,j)]);
                }
                k++;
            }
           
        }
         int min = Integer.MAX_VALUE;
        for(int i=findIndex(n-1,0);i<l;i++){
            min =  Math.min(min,arr[i]);
        }
        return min;
         
    }
    private int findIndex(int r,int c){
        return (r*(r+1))/2+c;
    }
}
