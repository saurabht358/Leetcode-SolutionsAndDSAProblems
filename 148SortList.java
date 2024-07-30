// Using Merge Sort 
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        return mergeSort(head);
    }
    ListNode mergeSort(ListNode head){
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = getMid(head);

        ListNode left = mergeSort(head);
        ListNode right = mergeSort(mid);

        return merge(left,right);
    }
    ListNode merge(ListNode l,ListNode r){
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        while(l!=null && r!=null){
            if(l.val<r.val){
                ans.next = l;
                l = l.next;
            }else{
                ans.next = r;
                r= r.next;
            }
            ans = ans.next;
        }
        if(l!=null){
            ans.next = l;
        }
        else ans.next = r;

        return dummy.next;
    }
    ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while(head!=null && head.next!=null){
            midPrev = (midPrev==null)? head: midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
