/*
*****
*****
*****
*****
*****
*/
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // if(j<=i)
                    System.out.print("*");
            }
            System.out.println();
        }

/*
*
**
***
****
*****
*/
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

/*
* * * * *
* * * *
* * *
* *
*
*/

          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<=n-i-1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<=i)
                    System.out.print(j+1 +" ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
/*
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/

        for(int i=1;i<=2*n-1;i++){
            int c = i <= n ? i: 2* n-i;
            for(int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

*/
        for(int i=1;i<=2*n-1;i++){
            int spaces =i<=n ? n-i:i-n;
            for(int j=1;j <=spaces;j++){
                System.out.print(" ");
            }
            
            int c = i <= n ? i: 2* n-i;
            for(int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }  
        


 int n=5;
          for(int i=0;i<=2*n;i++){
            for(int j=0;j<=2*n;j++){
                int val = Math.min(i,Math.min(j,Math.min(2*n-i,2*n-j)));
                System.out.print(val);
            }
            System.out.println();
        }
