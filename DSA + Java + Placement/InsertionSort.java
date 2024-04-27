import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        int arr[]= { 50,49,48,35,34,30,19,8,5,3,0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]) swap(arr,j,j-1);
            }
        }
    }
    public static void swap(int []arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
