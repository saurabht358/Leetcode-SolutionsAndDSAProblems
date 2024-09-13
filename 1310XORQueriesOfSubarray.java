class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int n = queries.length;
        int[] ans = new int[n];
        int[] prefSum = new int[arr.length];
        prefSum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefSum[i] = prefSum[i-1] ^ arr[i];
        } 
        for(int i=0;i<n;i++){
            ans[i] = (prefSum[queries[i][1]] ^ prefSum[queries[i][0]]) ^ arr[queries[i][0]];
        }
        return ans;
    }
     
}
