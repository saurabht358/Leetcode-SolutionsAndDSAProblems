package Arrays;

import  java.util.*;

public class Practice {
    public static void main(String[] args) {
        char ch='5';
        int num= 6;
        int ans = (int) ch-'0';
        System.out.println(ans);
        ch = Character.forDigit(num,10);
        System.out.println(((Object) ch).getClass().getSimpleName());
        System.out.println(((Object) num).getClass().getSimpleName());
    }
}
