// Soluiton 1
class Solution {
    public boolean isHappy(int n) {
        String str ="";
        str = str+ String.valueOf(n) +" "; //we creates a string and stores a digit separated with spaces
        
        int num = n;
        while(num!=1){
            num = getsqr(num);
            if(str.indexOf(" "+String.valueOf(num)+" ") >= 0){ // if that number is present in string means cycle is going to make so return false
                return false;
            }
            str = str + String.valueOf(num) +" "; // add that num to string for further tracking 
        }
        return true;
    }
  //method which calculates the sum of square of the all digit
    int getsqr(int num){
        if(num==0){
            return num;
        }
        int rem = num%10;
        return (rem*rem + getsqr(num/10));
    }
}

// Solution 2
class Solution {
    public boolean isHappy(int n) {
         // we observe that if a number is happy then it will stop at 1 and if not then that will creates a cycle
          // and using slow and fast pointer we can tell cycle is present or not 
        int fast=n,slow=n;
        do{
            slow = getsqr(slow);
            fast = getsqr(getsqr(fast));
        }while(slow!=fast); // if happy number is there then that will stop on 1 or non-happy number is there that will stop on other numbers
        return slow==1; // stop value is 1 then it is happy otherwise not happy
    }
    int getsqr(int num){
        if(num==0){
            return num;
        }
        int rem = num%10;
        return (rem*rem + getsqr(num/10));
    }
}
