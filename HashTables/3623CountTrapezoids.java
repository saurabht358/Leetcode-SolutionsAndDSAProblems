class Solution {
    public int countTrapezoids(int[][] points) {
        Map<Integer,Integer> map = new HashMap<>();
        long M = (long)(1e9+7);
        for(int[]p:points){
            map.put(p[1],map.getOrDefault(p[1],0)+1);
        }
         
        long lines =0;
        long ans = 0;
        for(int y:map.values()){
            long f = (long)(y);
            long l = ( (f * (f-1))/2 )%M;
            ans =( ans + (l * lines)%M ) %M;
            lines +=l;
        }
        return (int) ans;
    }
}
