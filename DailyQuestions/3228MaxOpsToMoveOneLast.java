class Solution {
    public int maxOperations(String s) {

        int ans=0;
        int c=0;
        boolean flag=false;
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                if(flag)
                ans+=c;
                flag= false;
            }else{
                flag=true;
                c++;
            }
        }
        return ans;
    }
}
