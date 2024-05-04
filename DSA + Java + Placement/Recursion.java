class Recursion{
    public static void main(String []args){
    
    //     int ans = fibo(5);
    //     System.out.println(ans);
        int [] arr= {1,2,4,6,7,9,12,13,15,16,18,21};
        System.out.println(BS(arr,0,arr.length-1,6));
    }
    
     public static int BS(int arr[],int l ,int h,int target){   
        if(l>h) return -1;
        else{
            int mid= l+(h-l)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid] < target) return BS(arr,mid+1,h,target);
            else return BS(arr,l,mid-1,target);
        }
         
    }
    public static long fibo(long n){
        if(long < 2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void  Hello(int n){
        if(n<1) return;
        System.out.println("Hello Saurabh");
        Hello(n-1);
    }
}
