package Recursion;
import java.util.*;
public class Subset {
     public static void main(String[] args) {


//        subSet("","abc");
         ArrayList<String> ans= new ArrayList<>();
         ArrayList<String> ne=  subSet("","abc",ans);
         System.out.println(Arrays.toString(ne.toArray()));

     }
     public static void subSet(String str,String up){
         if(up.isEmpty()){
             System.out.println(str);
             return;
         }
         subSet(str+ up.charAt(0),up.substring(1));
         subSet(str,up.substring(1));

     }
    public static ArrayList<String> subSet(String str,String up,ArrayList<String> ans){
        if(up.isEmpty()){
            ans.add(str);
            return ans;
        }
        subSet(str+ up.charAt(0),up.substring(1),ans);
        subSet(str,up.substring(1),ans);
        return ans;
    }

}
