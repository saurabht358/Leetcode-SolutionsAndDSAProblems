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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow = head,fast =head;
        while(fast!=null && fast.next!=null){ // find the middle node of linked list
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverse(slow);  // reverse the linked list from middle
        while(head!=null && slow!=null){ // check the reverse list and list from head // if value is not match return false
            if(head.val != slow.val) return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
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
