class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0,count2=0,mid= s.length()/2; // declare count1 & count 2 which count the no. of vowels in first half and second half resp. and mid is half of length of string
        for(int i=0;i<mid;i++){ // run loop for half of string
            if(isVow(s.charAt(i))){ // check character in first half as vowel or not by isVow method
                count1++;  // if yes, increment count1 by 1;
            }
            if(isVow(s.charAt(i+mid))){ // check character in second half as vowel or not by isVow method
                count2++; // if yes, increment count2 by 1;
            }
        }
        if(count1==count2) return true;
        return false;
    }
    public boolean isVow(char ch){ // this method check the given char is vowel or not 
        if(ch=='a' || ch=='A' || ch=='e' || ch== 'E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            return true; // if yes return true;
        }
        return false;  // otherwise return false;
    }
}
