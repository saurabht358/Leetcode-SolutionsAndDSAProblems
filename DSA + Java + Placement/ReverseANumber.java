public class Main
{
	public static void main(String[] args){
	    int num = 34794;
	    int n = (int)(Math.log(num)/ Math.log(10)) + 1; // size of integer
	    System.out.println(rev(num,n-1)); 
	    
	}
	public static int rev(int n,int base){ 
	    if(n==0) return 0;
	    return (n%10) * mul(base) + rev(n/10,base-1);
      // return (n%10)* (int)Math.pow(10,base) + rev(n/10,base-1);
	}
	static int mul(int base){ // this work as 10 to power base
	    int ans = 1;
	    while(base!=0){
	        ans*=10;
	        base--;
	    }
	    return ans;
	}
}
