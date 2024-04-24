// Solution 1 : In this solution we find minimum element and swap
class SelectionSort{
  public static void main(String[] args) {
        int arr[] = {4,-8,6,0,1,-35};
        for(int i=0;i<arr.length-1;i++){
            int minInd = Minimum(arr,i);
            swap(arr,minInd,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int Minimum(int []arr,int start){
        int end= arr.length, min=start;
        for(int i=start+1;i<end;i++){
            if(arr[i] < arr[min]) min=i;
        }
        return min;
    }
    public static void swap(int arr[],int a,int b){
        int temp= arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

// Solution 2 : In this solution we find maximum element and swap
class SelectionSort{
  public static void main(String[] args) {
        int arr[] = {9,6,3,8,1,10};
        for(int i=0;i<arr.length-1;i++){
            int maxInd = Maximum(arr,arr.length-i-1);
            swap(arr,maxInd,arr.length-i-1);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int Maximum(int []arr,int end){
        int max=end;
        for(int i=0;i<=end;i++){
            if(arr[i] > arr[max]) max=i;
        }
        return max;
    }
    public static void swap(int arr[],int a,int b){
        int temp= arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
