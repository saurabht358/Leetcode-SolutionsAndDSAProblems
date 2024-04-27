class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0,maxAlt = 0;
        for(int i=0;i<gain.length;i++){
            alt += gain[i];
            if(alt > maxAlt) maxAlt= alt;
        }
        return maxAlt;
    }
}
