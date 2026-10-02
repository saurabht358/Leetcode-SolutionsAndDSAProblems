class Solution {
    List<String> ans;
    int n;
    public List<String> generateParenthesis(int n) {
        this.n = n*2;
        ans = new ArrayList<>();
        dfs(0,0,"");
        return ans;
    }
    private void dfs(int ind,int val,String res){
        if(ind ==n){
            ans.add(res);
            return;
        }
        if(n-ind > val){
            dfs(ind+1,val+1,res+"(");
        }
        if(val > 0){
            dfs(ind+1,val-1,res+")");
        }

    }
}
