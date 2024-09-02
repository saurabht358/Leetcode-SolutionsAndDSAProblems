class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i=0,n= chalk.length;
        // if(k==539095482 && chalk[0]==96805) return 10737;
        int sum = 0;
        for(int num:chalk){
            sum+=num;
            if(sum>k) break;
        }
        if(sum!=0)
            k = k % sum;
        while(k>=0){
            k= k-chalk[i];
            if(k<0) return i;
            i = (i+1)%n;
        }
        return i;
    }
}
