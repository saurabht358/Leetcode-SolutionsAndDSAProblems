class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        int n=0;
        ListNode temp = head;
      // find the length of linked list first
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        int size = n/k;  // find the size of individual list by dividing into k parts
        int mod = n%k;  // find how many starting parts have one node more than others
        ListNode []ans = new ListNode[k]; // creating array of linked list
        temp = head;
        int i=0;
        for(;i<k;i++){
            ans[i] = temp;
            int j=0;
            if(i<mod) j=-1; // if it should contain one more node then we start iterates from -1
            for(;j<size-1;j++){
                if(temp==null)
                    break;
                temp = temp.next;
            }
            if(temp==null) break;
            ListNode next = temp.next;
            temp.next = null;
            temp = next;
        }
        while(i<k){
            ans[i++]=temp;
        }
        return ans;
        
    }
}
