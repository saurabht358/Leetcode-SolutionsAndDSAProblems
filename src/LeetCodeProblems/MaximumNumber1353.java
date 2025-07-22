package LeetCodeProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class MaximumNumber1353 {
    public static int maxEvents(int[][] events){
        Arrays.sort(events, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o2[1]==o2[1])return o1[0]-o2[0];
                return o1[1]-o2[1];
            }
        });
        int ans = 0;
        Set<Integer> set  = new HashSet<>();
        for(int[]e:events){
            if(possible(e,set))ans++;
        }
        return ans;
    }
    private static boolean possible(int[]e,Set<Integer>set){
        for(int i=e[0];i<=e[1];i++){
            if(!set.contains(i)){
                set.add(i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int events[][] = {{1,2},{2,3},{3,4}};
        int events1[][] = {{1,2},{2,3},{3,4},{1,1},{4,4}};
        System.out.println(maxEvents(events1));
    }
}
