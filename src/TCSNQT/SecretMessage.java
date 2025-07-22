package TCSNQT;

import java.util.Scanner;

public class SecretMessage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String message = sc.next();
        StringBuilder ans = new StringBuilder();
        for(char ch:message.toCharArray()){

            ans.append((char) ( 'a' + (ch-'a'+5)%26));

        }
        System.out.println(ans.toString());

    }

}
