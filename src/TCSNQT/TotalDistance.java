package TCSNQT;

import java.util.Scanner;

public class TotalDistance {
    public static void main(String[] args) {
        int[][] add = {{1,0},{1,1},{-1,0},{-1,1},{1,0}};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans[] = new int[2];

        int k=0;
        int prev = 10;
        while(k<n-1){
            int i = k  %5 ;
            if(add[i][0] < 0)
                ans[add[i][1]] -= prev;
            else
                ans[add[i][1]] += prev;
            prev+=10;
            k++;
        }

        System.out.println(ans[0] + " " + ans[1]);

    }
}
