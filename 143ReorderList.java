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
    public void reorderList(ListNode head) {
        ListNode mid = getMid(head);
        mid = reverse(mid);
        ListNode temp = head;

        while(mid.next!=null && temp!=null){
            ListNode next = temp.next;
            temp.next = mid;
            mid = mid.next;

            temp = temp.next;

            temp.next = next;

            temp = temp.next;
            

        }
         

    }
    ListNode getMid(ListNode head){
        ListNode slow = head,fast =head;
        while(fast!=null && fast.next!=null){ 
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    ListNode reverse(ListNode head){  // Function for doing reverse of list
        ListNode prev = null,mid =head;
        while(mid.next!=null){
            ListNode next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        mid.next = prev;
        return mid;
    }
}
