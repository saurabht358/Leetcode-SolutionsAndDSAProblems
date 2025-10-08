// #BinarySearch #HashMap #Sorting #two Pointer
class Solution {
     
    public int[] successfulPairs(int[] s, int[] p, long suc) {
        Arrays.sort(p);
        int m = s.length;
        int n = p.length;
        int max = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:p){
            map.put(num,map.getOrDefault(num,0)+1);
            max = Math.max(num,max);
        }
        int f[] = new int[max+1];
        f[max] = map.get(max);
        for(int i=max-1;i>=0;i--){
            int val = 0;
            if(map.containsKey(i))val = map.get(i);
            f[i] = val + f[i+1];
        }

        for(int i=0;i<m;i++){
            int k=(int) ((suc-1l)/s[i]);
            k+=1;
            if(k>max || k<0)s[i]= 0; 
            else s[i]=f[k];
        }
        return s;
    }

     
}
