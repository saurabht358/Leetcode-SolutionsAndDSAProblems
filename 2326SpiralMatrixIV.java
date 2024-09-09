class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][]ans = new int[m][n];
        ListNode temp = head;
        // int i=0,j=0;

        for(int i=0;i<m;i++){
            Arrays.fill(ans[i],-1);
        }

        int lr = 0,ur = m-1;
        int lc = 0,uc = n-1;
        while(temp!=null){
            for(int k=lc; k <= uc && temp!=null;k++){
                ans[lr][k] = temp.val;
                temp = temp.next;
            }
            if(temp==null) break;
            lr++;
            for(int k=lr; k<=ur && temp!=null;k++){
                ans[k][uc] = temp.val;
                temp = temp.next;
            }
            if(temp==null) break;
            uc--;
            for(int k=uc;k >= lc && temp!=null;k--){
                ans[ur][k] = temp.val;
                temp = temp.next;
            }
            if(temp==null) break;
            ur--;
            for(int k=ur;k >= lr && temp!=null;k--){
                ans[k][lc] = temp.val;
                temp = temp.next;
            }
            if(temp==null) break;
            lc++;
        }

        
        return ans;
    }
}
