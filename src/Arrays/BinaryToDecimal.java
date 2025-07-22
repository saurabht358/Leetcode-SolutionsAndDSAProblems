package Arrays;

public class BinaryToDecimal {
    public static String decToBin(int num){
        if(num==0) return "0";
        StringBuilder ans = new StringBuilder();
        while(num!=0){
            if((num&1)==1)ans.append('1');
            else ans.append('0');
            num>>=1;
        }
        ans.reverse();
        return ans.toString();
    }
    public static int BintoDec(String bin){
        int ans =0;
        int i=bin.length()-1;
        int base=1;
        while(i>=0){
            if(bin.charAt(i)=='1') ans+=base;
            base*=2;
            i--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 25;
        System.out.println(decToBin(num));
        System.out.println(BintoDec("1101"));
    }
}
