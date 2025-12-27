class Solution {
    int p[];
    int size[];
    public boolean equationsPossible(String[] equations) {
        p = new int[26];
        size = new int[26];
        Arrays.fill(p,-1);
        Arrays.fill(size,1);

        for(String s:equations){
            if(s.charAt(1)=='='){
                equal(s.charAt(0)-'a',s.charAt(3)-'a');
            }
        }
        for(String s:equations){
            if(s.charAt(1)=='!'){
                if(!notEqual(s.charAt(0)-'a',s.charAt(3)-'a'))return false;
            }
        }
        
        return true;

    }

    int parent(int i){
        if(p[i]==i)return i;
        p[i] = parent(p[i]);
        return p[i];
    }
    boolean notEqual(int a,int b){
        if(a==b)return false;
        int p1,p2;
        if(p[a]==-1 && p[b]==-1){
            p[a] = a;
            p[b] = b;
            return true;
        }else if(p[a]==-1){
            p[a] = a;
            return true;
        }else if(p[b]==-1){
            p[b] = b;
            return true;
        }else{
            if(parent(a)==parent(b)){
                return false;
            }
            return true;
        }
    }
    boolean equal(int a,int b){
        if(p[a]==-1 && p[b]==-1){
            p[a] = a;
            p[b] = a;
            size[a]++;
            return true;
        }else if(p[a]==-1){
            p[a] = p[b];
            size[b]++;
            return true;
        }else if(p[b]==-1){
            p[b] = p[a];
            size[a]++;
            return true;
        }else{
            int p1 = parent(a),p2 = parent(b);
            if(size[p1]<=size[p2]){
                p[p1] = p2;
                size[p2] +=size[p1];
            }else{
                p[p2] = p1;
                size[p1] += size[p2];
            }
            return true;
        }
    }
}
