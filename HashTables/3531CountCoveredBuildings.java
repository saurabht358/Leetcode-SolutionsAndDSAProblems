class Solution {
    public int countCoveredBuildings(int n, int[][] build) {
        Map<Integer,int[]> h = new HashMap<>();
        Map<Integer,int[]> v = new HashMap<>();

        for(int[] b :build){
            int i=b[0];
            int j =b[1];
            if(!v.containsKey(i)){
                int[] arr = {j,j};
                v.put(i,arr);
            }else{
                int[]arr = v.get(i);
                arr[0] = Math.min(arr[0],j);
                arr[1] = Math.max(arr[1],j);
                v.put(i,arr);
            }
            if(!h.containsKey(j)){
                int[] arr = {i,i};
                h.put(j,arr);
            }else{
                int[]arr = h.get(j);
                arr[0] = Math.min(arr[0],i);
                arr[1] = Math.max(arr[1],i);
                h.put(j,arr);
            }
        }
        int ans=0;
        for(int[] b :build){
            int i=b[0];
            int j =b[1];
            int[]arr1 = h.get(j);
            int[]arr2 = v.get(i);

            if(i>arr1[0] && i<arr1[1] && j>arr2[0] && j<arr2[1])ans++;
            
             
        }
        return ans;


    }
}
