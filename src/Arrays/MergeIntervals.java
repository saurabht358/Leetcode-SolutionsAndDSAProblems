package Arrays;
import java.util.*;
public class MergeIntervals {
    public static void main(String[] args) {

//                int[][] intervals = {{1,3},{ 2,6},{ 8,10},{15,18} };
                int[][] intervals = {{1,4},{ 4,5} };


                List<List<Integer>> list = new ArrayList<>();
                int start = intervals[0][0];
                int end = intervals[0][1],i;
                for( i=0;i<intervals.length-1;i++){
                    if(intervals[i][1] < intervals[i+1][0] ){
                        List<Integer> l = new ArrayList<>();
                        l.add(start);
                        l.add(intervals[i][1]);
                        list.add(l);
                        start = intervals[i+1][0];
                    }
                }
                List<Integer> la = new ArrayList<>();
                la.add(start);
                la.add(intervals[i][1]);
                list.add(la);

                for(List<Integer> li :list){
                    System.out.println(li);
                }


    }
}
