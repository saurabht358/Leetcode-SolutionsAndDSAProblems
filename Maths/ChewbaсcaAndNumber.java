// https://codeforces.com/contest/514/problem/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChewbaccaandNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();


            char[] num = br.readLine().trim().toCharArray();


            for(int i=0;i<num.length;i++){
                int r = num[i]-'0';
                r = Math.min(r,9-r);
                if(i==0 && r==0){
                    System.out.print(9);
                }else {
                    System.out.print(r);
                }
            }
            System.out.println();


    }

}
