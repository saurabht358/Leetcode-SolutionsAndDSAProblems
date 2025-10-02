// #simulation #math
class Solution {
    public int maxBottlesDrunk(int num, int ex) {
        int t= num;
        int sum= 0;
        while(t>=ex){
            sum++;
            t-=ex;
            t++;
            ex++;
        }
        return sum+num;
    }
}
