// #array , #math
class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> l = new ArrayList<>();
        String s = ""+n;
        int pow = (int)Math.pow(10,s.length()-1);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='0'){
                l.add((ch-'0')*pow);
            }
            pow/=10;
        }
        int ans[] = new int[l.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}
