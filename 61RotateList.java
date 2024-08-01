class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int l = length(head);
        if(k>l) k= k%l;
        if(k==l || k==0) return head;
        //skip l-k+1 nodes
        
        ListNode prev=head;
        for(int i=0;i<l-k-1;i++){
            prev = prev.next;
        }
        ListNode newHead = prev.next;
        prev.next = null;
        
        ListNode mid = newHead;
        while(mid.next!=null){
            mid = mid.next;
        }
        mid.next = head;
        return newHead;

    }
    int length(ListNode head){
        int count =0;
        while(head!=null && head.next!=null){
            count+=2;
            head = head.next.next;
        }
        if(head!=null){
            return count+1;
        }
        return count;
    }
}
