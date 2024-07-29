 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null || list2==null){
            if(list1!=null){
                return list1;
            }
            return list2;
        }
        ListNode ans = new ListNode();
        ListNode head = ans;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                ans.next = list1;
                list1 = list1.next;
            }else{
                ans.next = list2;
                list2 = list2.next;
            }
            ans = ans.next;
        }
        if(list1!=null){
            ans.next = list1;
        }
        else{
            ans.next = list2;
        }
        return head.next;
    }
}
