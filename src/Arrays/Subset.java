package Arrays;
import java.util.*;
public class Subset {
    public static void main(String[] args) {
        int []arr= {1,2,1};
        List<List<Integer>> list ;
//        list = subset(arr);
        list = subsetDuplicates(arr);
        for(List<Integer> l:list){
            System.out.println(l);
        }
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> ans= new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int num:arr){
            int n=ans.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(ans.get(i));
                internal.add(num);
                ans.add(internal);
            }

        }
        return ans;
    }

    static List<List<Integer>> subsetDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> ans= new ArrayList<>();
        ans.add(new ArrayList<>());
        int s,e=0;
        for(int i=0;i<arr.length;i++){
            s=0;
            int n=ans.size();
            if(i>0 && arr[i]==arr[i-1]){
                s = e+1;
            }
            e = ans.size()-1;
            for(int j=s;j<n;j++){
                List<Integer> internal = new ArrayList<>(ans.get(j));
                internal.add(arr[i]);
                ans.add(internal);
            }

        }
        return ans;
    }

}
