class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans= new ArrayList<>();
        int i=0;
        int n=arr.length;
        while(i<n){
            if(arr[i] < n &&  arr[i] != arr[arr[i]] ){
                swap(arr,i,arr[i]);
            }else i++;
        }
        boolean flag=false;
        for(int j=1;j<n;j++){
            if(arr[j] != j){
                ans.add(j);
            }if(arr[j] == n) flag = true;
        }
        if(arr[0]==n) flag = true;
        if(flag == false) ans.add(n);
        return ans;
    }
    public void swap(int arr[],int i,int j){
        int ttemp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = ttemp;
    }
}
