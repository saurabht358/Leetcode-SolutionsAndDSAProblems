class Solution {
    public List<String> validateCoupons(String[] code, String[] busi , boolean[] isActive) {
        List<String> ans = new ArrayList<>();
        List<String> ele = new ArrayList<>();
        List<String> gro = new ArrayList<>();
        List<String> pha = new ArrayList<>();
        List<String> res = new ArrayList<>();
        int n = code.length;
        for(int i=0;i<n;i++){
            if(isCode(code[i]) && isActive[i]){
                if(busi[i].equals("electronics")){
                    ele.add(code[i]);
                }else if(busi[i].equals("grocery")){
                    gro.add(code[i]);
                }else if(busi[i].equals("pharmacy")){
                    pha.add(code[i]);
                }else if(busi[i].equals("restaurant")){
                    res.add(code[i]);
                }
            }
        }
        Collections.sort(ele);
        Collections.sort(gro);
        Collections.sort(pha);
        Collections.sort(res);
        ans.addAll(ele);
        ans.addAll(gro);
        ans.addAll(pha);
        ans.addAll(res);
        return ans;
    }
    private boolean isCode(String s){
        if(s.equals(""))return false;
        for(char ch:s.toCharArray()){
            if( !( ('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z') || ('0'<=ch && ch<='9') || (ch=='_') ) ) return false;
        }
        return true;
    }
}
