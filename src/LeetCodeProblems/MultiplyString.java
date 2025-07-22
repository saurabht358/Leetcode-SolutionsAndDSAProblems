package LeetCodeProblems;

public class MultiplyString {
    public static void main(String[] args) {
        System.out.println(mulString("136","349"));
    }
    public static String mulString(String a,String b){
        long num1 = strToNum(0,a);
        long num2 = strToNum(0,b);

        String ans = new String();
        return ans.valueOf(num1 * num2);
    }
    static long strToNum(long ans,String str){
        if(str.isEmpty()){
            return ans;
        }
        int num = (int) (str.charAt(0)-'0');
        return strToNum(ans * 10 + num,str.substring(1));
    }
}
