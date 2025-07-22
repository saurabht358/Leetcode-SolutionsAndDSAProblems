package LeetCodeProblems;

import java.util.*;


public class LetterCombinations {
    public static void main(String[] args) {
//        String str="9";
//        List<String> ans = lettercombi("",str);
//        System.out.println(ans);

        System.out.println(padCount("","23"));

    }
    public static List<String> lettercombi(String p, String digits){
        if(digits.isEmpty()){
            List<String> l= new ArrayList<>();
            l.add(p);
            return l;
        }
        List<String> ans = new ArrayList<>();

        int digit = digits.charAt(0)-'0'; // this will convert '2' into 2
        int flags=0;
        int flage=0;
        if(digit==7){
            flage=1;
        }
        if(digit==8){
            flags=1;
            flage=1;
        }
        if(digit==9){
            flags=1;
            flage=2;
        }
        for(int i=(digit-2)* 3 + flags;i<((digit-1) * 3)+flage;i++){
            char ch = (char) ('a'+ i);
            ans.addAll(lettercombi(p + ch , digits.substring(1)));
        }

        return ans;
    }
    public static int padCount(String p, String digits){
        if(digits.isEmpty()){
            return 1;
        }
        int count=0;
        int digit = digits.charAt(0)-'0'; // this will convert '2' into 2
        int flags=0;
        int flage=0;
        if(digit==7){
            flage=1;
        }
        if(digit==8){
            flags=1;
            flage=1;
        }
        if(digit==9){
            flags=1;
            flage=2;
        }
        for(int i=(digit-2)* 3 + flags;i<((digit-1) * 3)+flage;i++){
            char ch = (char) ('a'+ i);
        count += padCount(p + ch , digits.substring(1));
        }

        return count;
    }
}
