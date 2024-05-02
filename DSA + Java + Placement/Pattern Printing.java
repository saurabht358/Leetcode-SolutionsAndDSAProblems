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
            }
            System.out.println();
        }

/*
*****
****
***
**
*
*/

          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=i)
                    System.out.print("*");
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
            }
            System.out.println();
        }
/*
*
**
***
****
*****
****
***
**
*
*/

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<=i)
                    System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(j>=i)
                    System.out.print("*");
            }
            System.out.println();
        }


          
        
