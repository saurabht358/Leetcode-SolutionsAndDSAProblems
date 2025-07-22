package TCSNQT;

import java.util.Scanner;

public class StarAndHash {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int diff = 0;
        for(char ch:input.toCharArray()){
            if(ch=='*')diff++;
            if(ch=='#')diff--;

        }
        if(diff < 0) diff= diff * -1;



        System.out.println(diff);

    }
}
