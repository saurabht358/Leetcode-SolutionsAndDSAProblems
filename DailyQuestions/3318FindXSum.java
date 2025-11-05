// #priorityqueu #array #map # sliding windo
class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int[] findXSum(int[] nums, int k, int x) {
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1 );
        }
        int n  = nums.length;
        int ans[]= new int[n-k+1];
        ans[0] = helper(x);
        for(int i=1;i<ans.length;i++){
            int f = map.get(nums[i-1]);
            if(f==1){
                map.remove(nums[i-1]);
            }else{
                map.put(nums[i-1],f-1);
            }
            map.put(nums[i+k-1],map.getOrDefault(nums[i+k-1],0)+1);
            ans[i] = helper(x);
        }

        return ans;
    }
    private int helper(int x){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1])return a[1]-b[1];
            return a[0]-b[0];
        });
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            pq.add(new int[]{e.getKey(),e.getValue()});
            if(pq.size() > x){
                pq.remove();
            }
        }
        int ans = 0;
        for(int[] a :pq){
            ans += a[0] * a[1];
        }   
        return ans;

    }
}
