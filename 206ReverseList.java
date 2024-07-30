/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=head,mid=head.next,fast = head.next.next;
        prev.next = null;
        while(fast!=null){
            mid.next = prev;
            prev = mid;
            mid = fast;
            fast = fast.next;
        }
        mid.next = prev;
        return mid;
    }
}
