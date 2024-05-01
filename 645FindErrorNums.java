class Solution {
    public int[] findErrorNums(int[] arr) {
        int i=0,n=arr.length;
        int ans[] = new int[2];
        while(i<n){
            if(arr[i] != arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }else i++;
        }

        for(int j=0;j<n;j++){
            if(arr[j] != j+1 ){
                ans[0] = arr[j];
                ans[1] = j+1;
                return ans;
            }
        }
        return ans;
    }
    public void swap(int arr[],int i,int j){
        int temp= arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp;
    }
}
