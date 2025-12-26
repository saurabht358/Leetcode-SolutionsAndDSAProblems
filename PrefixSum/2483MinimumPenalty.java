class Solution {
    public int bestClosingTime(String cus) {
        int minA = -1;
        int min  = cus.length();
        int n= min;
        int N = 0;
        int[]suf = new int[n];
        int cnt = 0;
        for(int i=n-1;i>=0;i--){
            if(cus.charAt(i)=='Y')cnt++;
            suf[i] = cnt;
        }
        for(int i=0;i<n;i++){
            int Y = 0;
            int pen  = N+suf[i];
            if(pen < min){
                min= pen;
                minA = i;
            }
            if(cus.charAt(i)=='N')N++;
        }
        if(N < min)return n;
        return (minA);
    }
}
