class Solution {
    public boolean checkStrings(String s1, String s2) {
        
        int n= s1.length();
        int o[] = new int[26];
        int e[] = new int[26];
        for(int i=0;i<n;i++){
            char c1=s1.charAt(i);
            char c2 =s2.charAt(i);
            if(c1!=c2){
                if(i%2==1){
                    o[c1-'a']++;
                    o[c2-'a']--;
                }else{
                    e[c1-'a']++;
                    e[c2-'a']--;
                }
            }
        }
        for(int i=0;i<26;i++){
            if(o[i]!=0 || e[i]!=0)return false;
        }
        return true;
    }
}
