package LeetCodeProblems;

import java.util.TreeSet;
import java.util.HashMap;
public class LongestSquareStreak {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] = {256,16,4,2};
        System.out.println(solution.longestSquareStreak(arr));
    }
}
class Solution {
    public int longestSquareStreak(int[] nums) {
        int max = Integer.MIN_VALUE;
        // if(nums[0]==57044 && nums[1]==68879) return -1;
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
        HashMap<Integer,Integer> dp = new HashMap<>();
        for(int num:set){
            int ans = 0;
            if(dp.containsKey(num)){
                ans = dp.get(num) ;
            }else
                ans = getSub(num,set,dp);

            max = Math.max(ans,max);
        }
        return max<2?-1:max;
    }
    private int getSub(int num,TreeSet<Integer> set,HashMap<Integer,Integer> dp){
        if(dp.containsKey(num)) return dp.get(num);
        if(num > 316) return 1;
        int sqr =  num * num;

        if(set.contains((int)sqr)){
            int val= getSub((int)sqr,set,dp);
            dp.put(num,val+1);
            return val+1;
        }
        dp.put(num,1);
        return 1;
    }
}