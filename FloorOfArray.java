Class FloorOfArray{
	public static void main(String []args){
		int []arr= {2,4,5,8,14,16,19};
		int target=0;
		System.out.println(floorOfArr(arr,target));
	}
	public static int floorOfArr(int arr[],int target){
		int l=0,h=arr.length-1;
		if(arr[arr.length-1]<target) return -1;
		if(arr[0]>target) return arr[0];
		while(l<=h){
			int mid = l+(h-l)/2;
			if(arr[mid]==target)return arr[mid];
			else if(arr[mid]<target)l=mid+1;
			else h=mid-1;
		}
		return arr[h];
	}
}