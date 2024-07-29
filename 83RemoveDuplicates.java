// Solution 1: 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode i,j;
        i=head;
        j=head;
        if(head==null) return head;
        while(i.next!=null){
            while(j.next!=null && j.val==j.next.val) j = j.next;
            if(j.next==null){
                i.next = null;
                return head;
            }
            i.next = j.next;
            j = j.next;
            i = i.next;
        }
        return head;
    }
}

// Solution 2:


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode i,j;
        i=head;
        if(head==null) return null;
        
        while(i.next!=null){
            if(i.val==i.next.val){
                i.next = i.next.next;
            }
            else {
                i = i.next;
            }
        }
         
        return head;
    }
}
