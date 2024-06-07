class Solution {
    public int numberOfSteps(int num) {
        return count(num); //count method returns the steps
    }
    int c = 0; // c will keep track of count
    public int count(int num){
        
        if(num==0) return c; // if num is zero then return count
        c++;   //if num is not zero increse count
        if((num & 1) == 0 ){ //check num is even or not
            return count(num/2);  //if num is even count the steps for half of that number
        }
        return count(num-1); //if num is odd, count the steps for less of that number by 1
    }
}
