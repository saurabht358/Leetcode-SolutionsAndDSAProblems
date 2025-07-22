package TCSNQT;
import java.util.*;
public class BitToggle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        StringBuilder numBin = new StringBuilder();
//        if(num==0){
//            System.out.println(num +" zero");
//            return;
//        }
//        int prod =1;
//        while(num!=0){
//            int rem = num%2;
//            num /=2;
//            if(rem==1){
//                numBin.append("1");
//            }else{
//                numBin.append("0");
//            }
//        }
//        int base=1;
//        int ans = 0;
//        for(int i=0;i<numBin.length();i++){
//            if(numBin.charAt(i)=='0'){
//                ans = ans + base;
//            }
//            base*=2;
//        }

        //find the length of number fist
        int k = (1<<(int) Math.floor(log2(num)+1))- 1;
        int ans = num ^ k;
        System.out.println(ans);

    }
    public static int log2(int n){
        return (int) (Math.log(n)/Math.log(2));
    }
}
