class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        char ch= s.charAt(0); 
        int i=goal.indexOf(ch);
        while(i!=-1){
            String temp = goal.substring(i)+goal.substring(0,i);
            if(temp.equals(s)) return true;
            
            i = goal.indexOf(ch,i+1);
            
        }
        return false;
    }
}
