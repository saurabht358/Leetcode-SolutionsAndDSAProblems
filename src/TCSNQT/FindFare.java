package TCSNQT;

import java.util.Scanner;

public class FindFare {
    public static void main(String[] args) {
        int []dist = {800,600,750,900,1400,1200,1100,1500};
        String [] stops = {"TH","GA","IC","HA","TE","LU","NI","CA"};
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        String end = sc.next();
        int st = -1;
        int en = -1;
        int i;
        for( i=0;i<stops.length;i++){
            if(stops[i].equals(start)) st= i;
            if(stops[i].equals(end))en = i;
        }
        if(st==-1 || en==-1){
            System.out.println("INVALID INPUT");
            return;
        }
        int totalDist = 0;
        if(st < en){
            for(i=st;i<8 && i<=en;i++){
                totalDist+=dist[i];
            }
        }else {
            for(i=st;i<8;i++){
                totalDist+=dist[i];
            }
            i=0;
            while(i<=en){
                totalDist+=dist[i];
                i++;
            }
        }


        int fare =   (int)Math.ceil(totalDist *  5.0/1000);
        System.out.println(fare);
    }
}
