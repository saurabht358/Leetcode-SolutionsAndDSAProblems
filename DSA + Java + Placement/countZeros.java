public class Main
{
	public static void main(String[] args){
	    int num = 4050400;
	     
	    System.out.println(countZero(num));
	    
	}
	static int countZero(int n){
	    if(n==0){
	        return 0;
	    }
	    if(n%10==0) 
	        return 1+countZero(n/10);
	    return countZero(n/10);
	}
}
