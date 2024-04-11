 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        
        int ind = findPeakElement(arr);
        int left= BSearch(arr,target,0,ind);
        if (left>=0) return left;
        int right= BSearch(arr,target,ind+1,arr.length()-1);
        return right;
         
    }
    public int BSearch(MountainArray arr,int target,int l,int h){
        boolean flag = arr.get(l) < arr.get(h);
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr.get(mid)==target){
                return mid;
            }else if(arr.get(mid)<target){
                if(flag) l=mid+1;
                else h=mid-1;
            } 
            else{
                if(flag) h=mid-1;
                else l=mid+1;
            } 
        }
        return -1;
    }
        public int findPeakElement(MountainArray arr) {
        
            int l=0,h=arr.length()-1;

            while(l<h){
                int mid= l+(h-l)/2;
            
                if(arr.get(mid) > arr.get(mid+1)){
                    h = mid;
                }else{
                    l = mid+1;
                }
            }
            return l;  
        }

         
}
