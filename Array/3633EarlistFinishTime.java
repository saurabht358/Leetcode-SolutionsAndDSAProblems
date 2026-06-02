class Solution {
    public int earliestFinishTime(int[] lst, int[] ld, int[] wst, int[] wd) {
        int lfirst = 3000;
        int wfirst = 3000;
        int n = lst.length,m=wst.length;
        for(int i=0;i<n;i++){
            lfirst = Math.min(lfirst,lst[i]+ld[i]);
        }
        for(int i=0;i<m;i++){
            wfirst = Math.min(wfirst,wst[i]+wd[i]);
        }


        int wsecond = getEarlist(lfirst,wst,wd);
        int lsecond = getEarlist(wfirst,lst,ld);


        return Math.min(wsecond,lsecond);
    }
    private int getEarlist(int dur,int [] st,int[]d){
        int n = st.length;
        int res = 3000;
        for(int i=0;i<n;i++){
            if(dur < st[i]){
                res = Math.min(res,st[i]-dur+d[i]);
            }else{
                res = Math.min(res,d[i]);
            }
        }
        return dur+res;
    }
}
