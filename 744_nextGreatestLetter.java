//Soulution No.1
class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int l=0,h=arr.length-1;
		if(arr[arr.length-1]<target) return arr[0];
		if(arr[0]>target) return arr[0];
		int mid=0;
        while(l<=h){
			mid = l+(h-l)/2;
			if(arr[mid]==target){
                if (mid>=arr.length-1) return arr[0];
                else if(arr[mid+1]==target) l=mid+1;
                else return arr[mid+1];
            }
			else if(arr[mid]<target)l=mid+1;
			else h=mid-1;
		}
		return arr[l];
    }
}
//Solution No.2
class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int l=0,h=arr.length-1;
		if(arr[arr.length-1]<target) return arr[0];
		if(arr[0]>target) return arr[0];
		int mid=0;
        while(l<=h){
		mid = l+(h-l)/2;
		if(arr[mid]<=target){
                	if (mid>=arr.length-1) return arr[0];
                	l=mid+1;
            	}
		else h=mid-1;
	}
	return arr[l];
    }
}
