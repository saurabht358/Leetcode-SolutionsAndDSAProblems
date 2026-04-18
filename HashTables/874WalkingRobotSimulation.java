class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obs = new HashSet<>();
        int x = 0,y =0,dir = 0;
        int max = 0;
        int []arr = {1,1,-1,-1};
        for(int[] o:obstacles){
            obs.add(""+o[0]+"#"+o[1]);
        }

        for(int c:commands){
            if(c==-1){
                dir = (dir+1)%4;
            }else if(c==-2){
                dir = (4+dir-1)%4;
            }else{
                int step = 0;
                for(;step<c;step++){
                    if(dir%2==0){
                        y+=arr[dir];
                    }else{
                        x+=arr[dir];
                    }
                    // xy[dir%2]+=arr[dir];
                    String ss = x+"#"+y;
                    
                    if(obs.contains(ss)){
                        if(dir%2==0){
                            y-=arr[dir];
                        }else{
                            x-=arr[dir];
                        }
                        break;
                    }
                    max = Math.max(max,x*x+y*y);
                }
            }
        }
        return max;
    }
}
