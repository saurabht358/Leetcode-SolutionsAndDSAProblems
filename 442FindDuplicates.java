class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans= new ArrayList<>();
        int i=0;
        int n=arr.length;
        while(i<n){
            if(arr[i] != arr[arr[i]-1] ){
                swap(arr,i,arr[i]-1);
            }else i++;
        }
        boolean flag=false;
        for(int j=0;j<n;j++){
            if(arr[j] != j+1 ){
                ans.add(arr[j]);
            } 
        } 
        return ans;
    }
    public void swap(int arr[],int i,int j){
        int ttemp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = ttemp;
       
    }
}
