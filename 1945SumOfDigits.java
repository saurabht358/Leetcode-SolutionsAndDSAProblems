class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(char ch:s.toCharArray()){
            int digit = (ch-'a') + 1;
            if(digit >=20){
                digit = 2 + digit % 10;
            }else if(digit >=10){
                digit = 1 + digit % 10;
            }
            else digit = digit;

            sum  = sum + digit;
        }
        k--;
        int num = sum;
        // System.out.println(sum);
        
        if(sum<10) return sum;

        while(k>0){
            sum =0;
            while(num != 0){
                int rem = num % 10;
                sum += rem;
                num/=10;
            }
            if(sum < 10) return sum;
            num = sum;
            k--;
        }
        return sum;
    }
}
