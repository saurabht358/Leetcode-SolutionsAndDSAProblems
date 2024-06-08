import java.util.*;
public class Main
{
	
	public static void main(String[] args) {
		int arr[] = {5,2,86,65,44,35,65};
		System.out.println(search(arr,65,0));
    // System.out.println(search2(arr,65,0));
	}
  static int search(int []arr,int target,int ind){
	    if(ind==arr.length){
	       //if(arr[ind]==target) return ind;
	         return -1;
	    }
	    else if(arr[ind]==target){
	        return ind;
	    }
	    return search(arr,target,ind+1);
	}
  
	static ArrayList<Integer> ans= new ArrayList<>();
	static ArrayList<Integer> search2(int []arr,int target,int ind){
	    if(ind==arr.length){
	       //if(arr[ind]==target) return ind;
	         return ans;
	    }
	    else if(arr[ind]==target){
	        ans.add(ind);
	    }
	    return search2(arr,target,ind+1);
	}

  static ArrayList<Integer> search3(int []arr,int target,int ind){
	    ArrayList<Integer> ans=new ArrayList<>();
	    if(ind==arr.length){
	       //if(arr[ind]==target) return ind;
	         return ans;
	    }
	    else if(arr[ind]==target){
	        ans.add(ind);
	    }
	    ArrayList<Integer> listofAll = new ArrayList<>();
	    listofAll = search3(arr,target,ind+1);
	    ans.addAll(listofAll);
	    
	    return ans;
	}
	
}
