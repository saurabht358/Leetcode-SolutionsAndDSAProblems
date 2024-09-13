class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        // Iterable itr = map.Iterable();
        HashSet<Integer> frequency = new HashSet<>();
        for(Map.Entry<Integer,Integer> obj:map.entrySet()){
            if(frequency.contains(obj.getValue())){
                return false;
            }
            frequency.add(obj.getValue());
        }
        return true;
    }
}
