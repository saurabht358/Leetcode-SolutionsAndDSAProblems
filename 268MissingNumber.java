class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        int n = arr.length;
        while(i<n){
            if(arr[i] < n && arr[i] != arr[arr[i]]){
                swap(arr,i,arr[i]);
            }else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j] != j) return j;
        }
        return n;
    }
    public void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
