
public class TrionicArrayI3637 {
    private static boolean isTrionicArray(int[] arr){
        int n = arr.length;
        int i=1;
        boolean flag = false;
        while(i<n && arr[i-1]<arr[i] ){
            i++;
            flag = true;
        }
        if(i==n || !flag)return false;
        flag = false;
        while(i<n && arr[i-1] > arr[i]){
            i++;
            flag = true;
        }
        if(i==n || !flag)return false;
        flag = false;
        while(i<n && arr[i-1] < arr[i]){
            i++;
            flag = true;
        }
        return i==n && flag;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2,6}; // array
//        int[] arr = {2,1,3}; // array

        System.out.println(isTrionicArray(arr));
    }

}
