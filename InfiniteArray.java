 class InfiniteArray{
    public static void main(String[] args) {
        int l=0,h=1;
        int target=35;
        int arr[]={1,3,4,5,7,9,15,16,18,21,25,29,35,65,124,128,135,138,148,168,175,185,188,189,495,500,501,502,507,509,554,557,559,584};
        int start=0,end=0;
        while(true){
            if(arr[l] <= target && arr[h] >= target){
                start = l;
                end = h;
                break;
            }
            int temp = 2 *l;
            l = h+1;
            h = l + temp;
        }
        int mid=-1;
        while(start<=end){
            mid= start+ (end-start)/2;
            if(arr[mid]==target) break;
            else if(arr[mid] > target) end= mid-1;
            else start =mid + 1;
        }if(start>end) System.out.println("-1");
        else{ 
            System.out.println(arr[l]);
            System.out.println(arr[h]);
            System.out.println(arr[mid]);
        }
        
    }
}
