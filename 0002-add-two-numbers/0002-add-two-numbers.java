class Solution {
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode t1 = head1;
        ListNode t2 = head2;
        int carry = 0;
        int sum = -1;
        while(t1!=null || t2!=null){
            int val1 = (t1==null) ? 0 : t1.val;
            int val2 = (t2==null) ? 0 : t2.val;
            sum = val1 + val2 + carry;
            carry = sum/10;
            t.next = new ListNode(sum%10);
            t = t.next;
            if(t1!=null) t1 = t1.next;
            if(t2!=null) t2 = t2.next;
        }
        if(carry>0) t.next = new ListNode(carry);
        dummy = dummy.next;
        return dummy;
    }
}