// #hashtables #heap #priorityqueue 
class Solution {
    
    public int[] avoidFlood(int[] r) {
        Map<Integer,LinkedList<Integer>> map = new HashMap<>();
        int n = r.length;
        for(int i=0;i<n;i++){
            int num = r[i];
            if(!map.containsKey(num)){
                map.put(num,new LinkedList<>());
            }else{
               map.get(num).add(i);
            }
        }
        int ans[] = new int[n];
        Set<Integer> set = new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> Integer.compare(a[0],b[0]));
        for(int i=0;i<n;i++){
            if(r[i]==0){
                if(set.isEmpty()){
                    ans[i]=1;
                }else{
                    int dry [] = pq.poll();
                    ans[i]= dry[1];
                    set.remove(dry[1]);
                }
            }else{
                if(set.contains(r[i])){
                    return new int[0];
                }else{
                    LinkedList<Integer> l = map.get(r[i]);
                    int ind =n;
                    if(!l.isEmpty()){
                        ind = l.pollFirst();
                    }
                    pq.offer(new int[]{ind,r[i]});
                    set.add(r[i]);
                    ans[i]= -1;
                }
            }
        }
        return ans;
    }
}
