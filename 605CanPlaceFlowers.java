class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n){
         
        if((flowerbed.length/2)+1 < n) return false; // maximum flowers arranged  is length/2+ 1 if n is greater than that ther return false

        int i=0;
        while(i<flowerbed.length-1 && n!=0){  // we will put flowers till n is not 0 and we traverse all array
            if(flowerbed[i]==1){ // if there is flower then we can not put flowers to it and its next so continue to i+=2;
                i+=2;
                continue;
            }else{  // if flower is not there then we check if flower is present in its next or not
                if(flowerbed[i+1]!=1){ // if not present then we put flower there and increment i by 2
                    flowerbed[i] = 1;
                    n--;
                    i+=2;
                }else{  // if present then we increse i by 3 
                    i+=3;
                }

            }
                 
        }
        if(n==0) return true;
        if(i<flowerbed.length && flowerbed[i] == 0)
        {
            n--;
        }
        return n==0;
    }
}
