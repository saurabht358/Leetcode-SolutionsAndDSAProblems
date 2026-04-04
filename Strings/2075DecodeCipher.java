//Approach 1
class Solution {
    public String decodeCiphertext(String enc, int n) {
        int col = enc.length()/n;
        if(n==1)return enc;
         
        StringBuilder out = new StringBuilder();
        
        for(int j=0;j<col;j++){
            for(int i=0;i<n;i++){
                 
                int ind = (i*col)+j+i;
                if(ind >= enc.length())continue;
                char ch = enc.charAt(ind);
                out.append(ch);
            }
        }

        return out.toString().stripTrailing();
         
    }
}
//Approach 2
class Solution {
    public String decodeCiphertext(String enc, int n) {
        int col = enc.length()/n;
        if(n==1)return enc;
         
        StringBuilder out = new StringBuilder();
        char arr[][] = new char[n][col];
        int k=0;
        for(int j=0;j<n;j++){
            for(int i=0;i<col;i++){
                arr[j][i] = enc.charAt(k);
                k++;
            }
        }
        for(int ii = 0;ii<col;ii++){
            int r = Math.min(n,col-ii);
            int i=0,j=ii;
            for(int jj=0;jj<r;jj++){
                out.append(arr[i][j]);
                i++;
                j++;
            }

        }

        return out.toString().stripTrailing();
         
    }
}
