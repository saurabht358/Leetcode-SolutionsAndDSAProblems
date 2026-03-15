class Solution {
    public int minOperations(String s) {
        int min = s.length();
        int n=min;
        int op =0;
        for(int i=0;i<n;i++){
            if(i%2==0 && s.charAt(i)=='1'){
                op++;
            }
            else if(i%2==1 && s.charAt(i)=='0'){
                op++;
            }
        }
        min = op;
        op=0;
        for(int i=0;i<n;i++){
            if(i%2==0 && s.charAt(i)=='0'){
                op++;
            }
            else if(i%2==1 && s.charAt(i)=='1'){
                op++;
            }
        }
        return min<op?min:op;
    }
}
