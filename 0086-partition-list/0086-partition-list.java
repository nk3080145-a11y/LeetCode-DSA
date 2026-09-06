class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode dummy1 = new ListNode(-1);
        ListNode temp1 = dummy1;
        ListNode dummy2 = new ListNode(-1);
        ListNode temp2 = dummy2;
        while(temp!=null){
            if(temp.val<x){
                temp1.next = temp;
                temp1 = temp;
                temp = temp.next;
            }
            else{
                temp2.next = temp;
                temp2 = temp;
                temp = temp.next;
            }
        }
        temp1.next = dummy2.next;
        temp2.next = null;
        return dummy1.next;
    }
}