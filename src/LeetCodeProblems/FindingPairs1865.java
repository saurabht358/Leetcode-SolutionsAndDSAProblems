package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class FindingPairs1865 {
    Map<Integer,Integer> m1 ;
    Map<Integer,Integer> m2 ;
//    int[]num1;
    int[]num2;

    FindingPairs1865(int[] a1,int a2[]){
//        num1  = a1;
        m1 = new HashMap<>();
        m2 = new HashMap<>();
        num2 = a2;
        for(int a:a1){
            m1.put(a,m1.getOrDefault(a,0)+1);
        }
        for(int a:a2){
            m2.put(a,m2.getOrDefault(a,0)+1);
        }

    }
    void add(int index,int val){
        int prev = num2[index];
        m2.put(prev+val,m2.getOrDefault(prev+val,0)+1);
        int t = m2.get(prev);
        num2[index] = prev+val;
        if(t>1)m2.put(prev,m2.get(prev)-1);
        else m2.remove(prev);
    }
    int count(int tot){
        int ans  = 0;
        for(int k:m1.keySet()){
            int req = tot-k;
            if(m2.containsKey(req)){
                ans +=  m2.get(req)*m1.get(k);
            }
        }

        return ans;
    }



    public static void main(String[] args) {
        FindingPairs1865 f = new FindingPairs1865(new int[]{1,1,2,2,2,3},new int[]{1,4,5,2,5,4});
        System.out.println(f.count(7));
        f.add(3,2);
        System.out.println(f.count(8));
        System.out.println(f.count(4));
        f.add(0,1);
        f.add(1,1);
        System.out.println(f.count(7));
    }

}


