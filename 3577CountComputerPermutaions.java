class Solution {
    public int countPermutations(int[] com) {
        long ans =1;
        long M= (long)1e9+7;
        int z = com[0];
        for(int i=1;i<com.length;i++){
            if(com[i]<= z) return 0;
            ans = (ans * i)%M;
        }
        return (int)ans;
    }
}
