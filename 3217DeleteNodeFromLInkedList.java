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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            if(set.contains(temp.val)){
                if(prev == null ){
                    head = temp.next;
                    temp = temp.next;
                }else{
                    prev.next = temp.next;
                    temp = temp.next;
                    // prev = temp;
                }
                // temp = temp.next;
            }else{
                prev = temp;
                temp = temp.next;
            }
            
        }
        // if(temp != null && set.contains(temp.val)){
        //     temp = null;
        // }
        return head;
    }
}
