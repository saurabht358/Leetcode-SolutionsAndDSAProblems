package LeetCodeProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindOriginalTypedString3333 {
    public int findOriginalType(String type,int k){

        ArrayList<Integer> f = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        int same = 1;
        set.add(type.charAt(0));
        for (int i = 1 ; i <type.length() ; i++) {
            set.add(type.charAt(i));
            char prev = type.charAt(i-1);
            if(prev!=type.charAt(i)){
                f.add(same);
                same = 1;
            }else same++;
        }
        f.add(same);



        long tot = 0;
        for(int num:f){
            tot *=num;
        }

        if(k <= f.size()) return (int)(tot);




        return 0;
    }
    public static void main(String[] args) {

    }
}
