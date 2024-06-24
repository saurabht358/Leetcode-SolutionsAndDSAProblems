class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
         
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                ans.add( nums1[i]);
                i++;j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else j++;
        }
        
        
        
        Object []obj = ans.toArray();
        int arr[] = new int[ans.size()];
        for(Object num:obj){
            arr[k++]=(int)num;
        }
        return arr;
    }
}
