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
    public ListNode doubleIt(ListNode head) {
        int carry = multiply(head); // call the multiply function and store the carry if exits
        if(carry>0){ // if carry exits
            head = new ListNode(carry,head); // create a new node and next of new node pointing to the head; store new node in head;
            return head; // return new node;
        }
         
        return head; // if no carry return head
    }

    public int multiply(ListNode head){
        if(head==null){ // base condition
            return 0; 
        }
        int value = head.val * 2 + multiply(head.next); // multiply head val with 2 and add with its multiply of right side nodes
        head.val = value %10; // store last value 
        int carry = value/10; // store remaining values as carry
        return carry;

    }
}
