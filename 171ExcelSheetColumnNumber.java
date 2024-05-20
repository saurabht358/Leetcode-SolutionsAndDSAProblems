class Solution {
    public int titleToNumber(String columnTitle) {
        int ans =0; // This store a ans
        int count =0; // This variale is used for calculating base value
        for(int i=columnTitle.length()-1;i>=0;i--){ //we traversing from right to left (least significant bit to most significant bit)
            ans += (int) Math.pow(26,count) * (int) (columnTitle.charAt(i)-'A'+1); // add ans and base value of that index with letter
            count++; // increase the index
        }
        return ans; // return ans
    }
}
