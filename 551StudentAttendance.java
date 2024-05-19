class Solution {
    public boolean checkRecord(String s) {
        int abs =0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A' && ++abs > 1) return false;
            if(i<s.length()-2 && ch=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L')
                return false;
        }
        return true;
    }
}
