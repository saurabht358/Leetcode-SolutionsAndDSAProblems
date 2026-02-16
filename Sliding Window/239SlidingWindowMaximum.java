class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1)return nums;
        Deque<Integer> deq = new LinkedList<>();
        
        int n = nums.length;
        int []ans = new int[n-k+1];
        for(int j=0;j<n;j++){
            //removing elements which are not in the window
            while(!deq.isEmpty() && deq.peekFirst() <= j-k){
                deq.pollFirst();
            }


            //removing from last if new element which is going to add in window is maximum than previous elements so removing is better
            while(!deq.isEmpty() && nums[deq.peekLast()] < nums[j]){
                deq.pollLast();
            }

          //adding that elements insuring no any lesser number in queue before it from selected window
            deq.addLast(j);

            //maximum value in window
          // first element is always going to the max for that window
            if(j >= k-1){
                ans[j-k+1] =nums[ deq.peekFirst()];
            }
        }
        return ans;
    }
}
