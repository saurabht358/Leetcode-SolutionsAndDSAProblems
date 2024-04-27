class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            for(int j=0;j<(image.length+1)/2;j++){
                if(j == image.length-j-1){
                    if(image[i][j]==0) image[i][j] = 1;
                    else image[i][j] = 0;
                    break;
                }
                swap(image,i,j,i,image.length-j-1);
            }
             
        }
         
        return image;
    }
    public  void swap(int [][]arr,int i,int j,int l,int m){
        int temp = arr[i][j];
        arr[i][j] = arr[l][m];
        arr[l][m] = temp;
        
        if(arr[i][j]==0) arr[i][j] = 1;
        else arr[i][j] = 0;
        if(arr[l][m]==0) arr[l][m] = 1;
        else arr[l][m] = 0;
    }
     
}
