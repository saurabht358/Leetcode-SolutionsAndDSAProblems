public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        return bs(nums,0,nums.length-1);
    }
    private int bs(int[]a,int l,int h){
        if(l==h){
            if( a[l]==l)return l+1;
            // if(l==0 && a[0]!=0)return 0;
            // if(l==a.length-1 && a[l]==l) return l+1;
            return l;

        }
        int m =l+(h-l)/2;
        if(a[m] <= m)return bs(a,m+1,h);
        return bs(a,l,m);
    }
