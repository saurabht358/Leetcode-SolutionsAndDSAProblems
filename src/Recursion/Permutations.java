package Recursion;
import java.util.*;
public class Permutations {
    public static void main(String[] args) {

//        System.out.println("hello");
        ArrayList<String> str = permutations1("","ab");
//        ArrayList<String> str = permutations("","ab",new ArrayList<>());
//        ArrayList<String> str = permutations("","ab");
//        System.out.println(str);
        System.out.println(permutationsCount("","abc"));

    }
    static void permutations(String p,String op){
        if(op.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=op.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f= p.substring(0,i);
            String s= p.substring(i);

            permutations(f+ch+s ,op.substring(1));
        }
    }

    static ArrayList<String> permutations(String p,String op,ArrayList<String> ans){
        if(op.isEmpty()){
            ans.add(p);
            return ans;
        }
        char ch=op.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f= p.substring(0,i);
            String s= p.substring(i);

            permutations(f+ch+s ,op.substring(1),ans);
        }
        return ans;
    }
    static ArrayList<String> permutations1(String p,String op){
        if(op.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        char ch=op.charAt(0);
        ArrayList<String> ans= new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f= p.substring(0,i);
            String s= p.substring(i);

            ans.addAll(permutations1(f+ch+s ,op.substring(1)));
        }
        return ans;
    }
    static int  permutationsCount(String p,String op){
        if(op.isEmpty()){
            return 1;
        }
        int count  =0;
        char ch=op.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f= p.substring(0,i);
            String s= p.substring(i);

            count += permutationsCount(f+ch+s ,op.substring(1));
        }
        return count;
    }
}
