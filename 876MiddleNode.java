class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next==null) return head;
        ListNode slow = head,fast=head; // use fast and slow concept
        while(fast!=null && fast.next!=null){   // when fast  is null that time slow at the middle of list
            slow = slow.next;  // slow is moving one step at a time
            fast = fast.next.next;  // fast is moving two step at a time || moving double than slow
        }
        return slow;
    }
}
