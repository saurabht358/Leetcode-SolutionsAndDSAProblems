class SqureRoot{
    public static void main(String[] args) {
         int num = 2;
         float sqr = sqrt(num);
         System.out.println(sqr);
         sqr = getDecimal(num,sqr,3);
         System.out.println(sqr); 
    }
    public static float getDecimal(int num,float sqr,int p){
        float add = 0.1f;
        for(int i=1;i<=p;i++){
            while(sqr *sqr <= num){
                sqr+=add;
            }
            sqr-=add;
            add/=10;    
        }
        return  sqr;
    }
    public static int sqrt(int num){
        int l=0,h=num;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(mid*mid == num){
                return mid;
            }else if(mid*mid > num){
                h=mid-1;
            }else
                l=mid+1;
        }
        return h;
    }
}
