package Recursion;

public class SkipChar {
    public static void main(String[] args) {

        String str = "sdapplek";
//        str = skipStr(str,"ple");
        str = skipChar(str,'p');
        System.out.println(str);
    }

    public static String skipChar(String str,char ch){
        if(str.isEmpty()) return "";
        if(str.charAt(0)==ch){
            return skipChar(str.substring(1),ch);
        }
        return (str.charAt(0)+ skipChar(str.substring(1),ch));
    }

    public static String skipStr(String str,String target){
        if(str.isEmpty()) return "";
        if(str.startsWith(target)){
            return skipStr(str.substring(target.length()),target);
        }
        return (str.charAt(0)+ skipStr(str.substring(1),target));
    }
}
