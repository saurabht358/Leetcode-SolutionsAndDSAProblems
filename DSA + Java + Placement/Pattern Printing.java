class Pattern{
        public static void main(String []args){
                pattern1(5);
        }
}




/*
*****
*****
*****
*****
*****
*/
 static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // if(j<=i)
                    System.out.print("*");
            }
            System.out.println();
        }
 }

/*
*
**
***
****
*****
*/
 static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
 } 
/*
* * * * *
* * * *
* * *
* *
*
*/
 static void pattern3(int n){
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<=n-i-1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
 }
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
 static void pattern4(int n ){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<=i)
                    System.out.print(j+1 +" ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
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
 static void pattern5(int n){
        for(int i=1;i<=2*n-1;i++){
            int c = i <= n ? i: 2* n-i;
            for(int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
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
 static void pattern6(int n){
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
 }
/*
1 1 1 1 1 1 1 
1 2 2 2 2 2 1 
1 2 3 3 3 2 1 
1 2 3 4 3 2 1 
1 2 3 3 3 2 1 
1 2 2 2 2 2 1 
1 1 1 1 1 1 1 
*/        
static void pattern7(int n){
        for(int i=0;i<=2*n;i++){
            for(int j=0;j<=2*n;j++){
                int val = Math.min(i,Math.min(j,Math.min(2*n-i,2*n-j)));
                System.out.print(val+1+" ");
            }
            System.out.println();
        }
}
/*
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
*/
static void pattern8(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
}
/*
* * * * * 
  * * * * 
    * * * 
      * * 
        * 
*/
static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){ // print spaces 
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++){ // print stars
                System.out.print("* ");
            }
            System.out.println();
        }
}
/*
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
*/
static void pattern10(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<= 2 * i -1 ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
}
/*
********* 
 ******* 
  ***** 
   *** 
    * 
*/
static void pattern11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<= 2 * n -i*2 +1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
/*
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
*/
static void pattern12(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=  n - i +1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
}
/*
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *

*/
static void pattern13(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=  n - i +1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
}
/*
    *
   * *
  *   *
 *     *
*********
*/

static void pattern14(int n){
        for(int i=1;i<=n;i++){
            if(i==1){
                for(int j=1;j<=n-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else if(i==n){
                for(int j=1;j<=2*n -1;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=n-i;j++)
                    System.out.print(" ");
                System.out.print("*");
                for(int j=1;j<=(i-1)*2-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
}

/*
*************
 *         *
  *       *
   *     *
    *   *
     * *
      *
*/

static void pattern15(int n){
        for(int i=1;i<=n;i++){
            if(i==n){
                for(int j=1;j<=n-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else if(i==1){
                for(int j=1;j<=2*n -1;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=i-1;j++)
                    System.out.print(" ");
                System.out.print("*");
                for(int j=1;j<=2 * n - 2*i-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
}
/*
      *
     * *
    *   *
   *     *
  *       *
 *         *
*           *
*           *
 *         *
  *       *
   *     *
    *   *
     * *
      *
*/
static void pattern16(int n){
        for(int i=1;i<=n*2;i++){
            if(i== 2* n || i==1){
                for(int j=1;j<=n-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else{
                int c= i<=n ? n-i:i-n-1;
                for(int j=1;j<=c;j++)
                    System.out.print(" ");
                System.out.print("*");
                c= i<=n ? 2*(i-1)-1: 2*n -2*(i-n)-1;
                for(int j=1;j<=c;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
}
