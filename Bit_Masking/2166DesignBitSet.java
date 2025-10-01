class Bitset {
    boolean b[];
    int cnt =0,n;
    boolean flip = false;

    public Bitset(int size) {
        b = new boolean[size];
        n = size;
    }
    
    public void fix(int idx) {
        if(flip){
            if(b[idx]){
                cnt++;
            }else{
                
            }
            b[idx] = false;
        }else{

            if(b[idx]){
                
            }else{
                cnt++;
            }
            b[idx] = true;
        }

         
    }
    
    public void unfix(int idx) {
        if(flip){
            if(b[idx]){
                 
            }else{
                cnt--;
            }
            b[idx] = true;
        }else{

            if(b[idx]){
                cnt--;
            }else{
                 
            }
            b[idx] = false;
        }
    }
    
    public void flip() {
        flip = !flip;
        cnt = n-cnt;
    }
    
    public boolean all() {
        return cnt==n;
    }
    
    public boolean one() {
        return cnt>0;
    }
    
    public int count() {
        return cnt;
    }
    
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){
            if(b[i] != flip )res.append('1');
            // else if(b[i]) res.append('0');
            // else if(!b[i] && flip)res.append('1');
            else res.append('0');
        }
        return res.toString();
    }
}

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */
