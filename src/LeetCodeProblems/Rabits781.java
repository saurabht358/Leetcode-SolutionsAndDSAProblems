package LeetCodeProblems;

import java.util.HashMap;

public class Rabits781 {
    public int numRabbits(int[] answers) {
        int ans = 0;
        int n = answers.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : answers){
            if(num==0){
                ans+=1;
                continue;
            }
            int prev = map.getOrDefault(num,0);
            if(prev==num){
                ans+=(num+1);
                map.remove(num);
            }else{
                map.put(num,prev+1);
            }
        }
        for(int num:map.keySet()){
            ans+=(num+1);
        }
        return ans;
    }

}
