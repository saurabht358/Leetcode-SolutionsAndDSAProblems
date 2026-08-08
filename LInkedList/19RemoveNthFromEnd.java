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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = length(head);
        if(len ==1 && n==1)return null;

        int k=len-n;

        if(k==0){
            return head.next;
        }
        ListNode cur = head;
        int pos = 1;

        while(pos < k){
            cur = cur.next;
            pos++;
        }
        cur.next = cur.next.next;
        return head;

    }
    private int length(ListNode node){
        int len =0;
        while(node!=null){
            node=node.next;
            len++;
        }
        return len;
    }
}
