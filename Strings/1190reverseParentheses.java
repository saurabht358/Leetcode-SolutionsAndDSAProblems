class Solution {
    public String reverseParentheses(String ss) {
        
        Stack<Integer> stk = new Stack<>();
        int n = ss.length();
        char [] s = ss.toCharArray();
        for(int i=0;i<n;i++){
            if(s[i]=='('){
                stk.push(i);
            }else if(s[i]==')'){
                int start = stk.pop();
                reverse(s,start+1,i-1);
            }
        }

        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            if(!(s[i]==')' || s[i]=='('))ans.append(s[i]);
        }

        return ans.toString();

    }
    private void reverse(char[]ss,int s,int e){
        if(s>=e)return;
         
        while(s<e){
            char temp = ss[s];
            ss[s] = ss[e];
            ss[e] = temp;
            s++;e--;
        }
    }
}
