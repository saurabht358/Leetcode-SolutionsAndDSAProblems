class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max=candies[0];
        for(int num:candies){
            if(num > max) max = num;
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max) result.add(i,true);
            else result.add(i,false);;
        }
        return result;
    }
}
