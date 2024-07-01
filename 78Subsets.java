class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        return subset(new ArrayList<Integer>(),nums,ans);
    }
    public List<List<Integer>> subset(List<Integer> set,int[] arr,List<List<Integer>> ans){
        if(arr.length==0){
            List<Integer> s = new ArrayList<>();
            s.addAll(set);
            ans.add(s);
            return ans;
        }
        
        ArrayList<Integer> newset= new ArrayList<>();
        newset.addAll(set);
        newset.add(arr[0]);
        subset(newset,Arrays.copyOfRange(arr,1,arr.length),ans);
        subset(set,Arrays.copyOfRange(arr,1,arr.length),ans);
         
        return ans;
    }
    
}
