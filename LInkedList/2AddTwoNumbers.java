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
    long getNum(ListNode node){
        long sum = 0;
        int pow = 0;
        while(node!=null){
            long d = node.val;
            d = (long)Math.pow(10,pow)*d;
            sum+=d;
            pow++;
            node = node.next;
        }
        return sum;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode head = new ListNode();
        ListNode node = head;
        
        int carry = 0;
        while(l1 !=null && l2!=null){
            int sum = l1.val + l2.val + carry;
            if(sum > 9)carry = 1;
            else carry = 0;
            node.next = new ListNode(sum%10);
            node = node.next;
           
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 !=null ){
            int sum = l1.val  + carry;
            if(sum > 9)carry = 1;
            else carry = 0;
            node.next = new ListNode(sum%10);
            node = node.next;
            l1 = l1.next; 
        }
        
        while(l2 !=null ){
            int sum = l2.val  + carry;
            if(sum > 9)carry = 1;
            else carry = 0;
            node.next = new ListNode(sum%10);
            node = node.next;
            l2 = l2.next; 
        }
        if(carry==1){
            node.next = new ListNode(1);
        }
        return head.next;
    }
}
