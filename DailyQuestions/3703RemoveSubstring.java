// #stack  # string  #count
class Solution {
    public String removeSubstring(String s, int k) {
        int n= s.length();
        // int len = sub.length();
        StringBuilder ss = new StringBuilder(s);
        int cnt = 0,i=0;boolean next = true;
        while(next){
            s = ss.toString();
            ss = new StringBuilder();
            next= false;
            n = s.length();
            cnt =0;
            i=0;
        while(i+k<=n){
            char ch= s.charAt(i);
            if(ch=='('){
                cnt++;
                ss.append(ch);
                i++;
            }else{
                if(cnt >=k && check(s,i,i+k)){
                    i+=k;
                    int ll = ss.length();
                    ss.setLength(ll-k);
                    cnt-=k;
                    next = true;
                }else{
                    ss.append(ch);
                    cnt = 0;
                    i++;
                }
            }
        }
         while(i<n){
            ss.append(s.charAt(i));
            i++;
        }

        }
        
        return ss.toString();
    }
    private boolean check(String s,int i,int k){
        if(k>s.length())return false;
        for(;i<k;i++){
            if(s.charAt(i)!=')')return false;
        }
        return true;
         
    }
}
