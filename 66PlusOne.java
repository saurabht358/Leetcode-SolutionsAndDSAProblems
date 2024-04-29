class Solution {
    public int[] plusOne(int[] digits) {
        int i;
        for( i=digits.length-1; i>=0;i--){
            if(digits[i] != 9){
                digits[i]++;
                break;
            }else
                digits[i]=0;
        }
        if(i==-1){
            int[] ans= new int[digits.length+1];
            ans[0] =1;
            for(int j=1;j<ans.length;j++){
                ans[j] = 0;
            }
            return ans;
        }
        return digits;
    }
}
