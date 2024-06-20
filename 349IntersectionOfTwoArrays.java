//Solution 1
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> table = new HashSet<>();
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            if(BS(nums2,nums1[i])){
                table.add(nums1[i]);
            }
        }
        int[] ans=new int[table.size()];
        int i=0;
        for(int num:table){
            ans[i++] = num;
        }
        return ans;
    }
    public boolean BS(int []arr,int target){
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid] > target) h=mid-1;
            else l=mid+1;
        }
        return false;
    }
}

//Solution 2
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> table = new HashSet<>();
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                table.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else j++;
        }
        int[] ans=new int[table.size()];
        int k=0;
        for(int num:table){
            ans[k++] = num;
        }
        return ans;
    }
     
}
