class Solution {
    public int[][] merge(int[][] intervals) {
        for(int i=0;i<intervals.length-1;i++){
            for(int j=1;j<intervals.length-i;j++){
                if(intervals[j-1][0] > intervals[j][0]){
                    int[] temp = intervals[j-1];
                    intervals[j-1] = intervals[j];
                    intervals[j] = temp;
                }
            }
        }
        
        for(int[] nums:intervals){
            System.out.print(Arrays.toString(nums));
        }
        
        List<int[]> list = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1],i;
        for( i=0;i<intervals.length;i++){
            if(intervals[i][0] > end ){
                int[] l = new int[2];
                l[0]= start;
                l[1]= end;
                list.add(l);
                start = intervals[i][0];
                end = intervals[i][1];
            }
            if(end < intervals[i][1]) end=intervals[i][1];
        }
        int[] la = new int[2];
        la[0]= start;
        la[1]= end;
        list.add(la);

        int[][] arr= new int[list.size()][2];
        for( i=0;i<arr.length;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = list.get(i)[j];
            }
        }
        return arr;
    }
}
