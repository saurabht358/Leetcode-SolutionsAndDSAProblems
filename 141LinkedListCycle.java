//Solution 1
public class Solution {
    public boolean hasCycle(ListNode head) {
        while(head!=null){  // if circle is not present then head is obeasily become null
            if(head.val == 100005){ // in a leetcode constrains : range of value can be less than 10 to the power 5 so we substitute 
                return true;        // so whenewer we find the node we update that value as 100005 and if node.val is 100005 in next iteration then we can say that circle is present
            }
            head.val = 100005;
            head = head.next;  
        }
        return false;
    }
}

// Solution 2
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow=head,fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;          // slow has going one by one and fast is going twice at a time so, if there is a circle then after some time the faster will meet to slow node 
            fast = fast.next.next;     // because if two men running in same order in circular track then there 100% of they will meet at same point after some amount of time
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
