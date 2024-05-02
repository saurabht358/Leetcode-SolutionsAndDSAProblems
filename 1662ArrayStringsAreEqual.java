//Solution 1
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i=0,j=0,l=0,m=0;
        while(i<word1.length && l<word2.length){
            if(word1[i].charAt(j) != word2[l].charAt(m)){
                return false;    
            }
            if(j+1 == word1[i].length()){
                i++;
                j=0;
            }else j++;
            if(m+1 == word2[l].length()){
                l++;
                m=0;
            }else m++;
        }
        if(i<word1.length || l<word2.length) return false;
        return true;
    }
}

// Solution 2

 class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = new String();
        String str2 = new String();

        for(String s:word1){
            str1+=s;
        }
        for(String s:word2){
            str2+=s;
        }
        
        return str1.equals(str2);
    }
 }
