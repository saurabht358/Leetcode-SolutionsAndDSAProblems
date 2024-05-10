class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder(); //we create StringBuilder object for storing and assigning its lower charcter
        for(int i=0;i<s.length();i++){ 
            if(s.charAt(i) <= 'Z' && s.charAt(i) >='A'){ // we check for uppercase letter if found
                ans.append((char)((int)s.charAt(i)+32));  // then assign ASCII value of uppercase character + 32 because java use ascii value concept to store character
            }else{                                        
                ans.append(s.charAt(i));    // if that is small then assign as it is
            }
        }
        return ans.toString(); // converting the StringBuilder to String
    }
}
