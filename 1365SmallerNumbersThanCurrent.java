
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []temp = nums.clone();
        Arrays.sort(temp); 
        int []ans=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            int ind = Bsearch(temp,nums[i]);
            ans[i] = ind;
        } 
        return ans;      
    }
    public int Bsearch(int []arr,int key){
        int l=0,h=arr.length-1;
        int ind=0;
        while(l<=h){
            int mid= l+(h-l)/2;
            if(arr[mid]==key){
                ind = mid;
                h = mid-1;               
            }else if(arr[mid] > key) h = mid-1;
            else l=mid+1;
        }
        return ind;
    }
}
