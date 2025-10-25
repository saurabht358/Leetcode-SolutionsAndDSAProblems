// #math 
class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int cur = 1;
        int i =1;
        while( i+6<=n ){
            // total += (cur+6+1)*(cur+6)/2 - cur*(cur-1)/2;
            total += (cur + cur+6)*7 /2;
            cur++;
            i+=7;
        }
        for(int j=0;j<=n-i;j++){
            total+=cur++;
        }
        return total;
    }
}
