class Solution {
    public ListNode swapPairs(ListNode head) {
        // ListNode d1 = new ListNode(-1);
        // ListNode d2 = new ListNode(-1);
        // ListNode t1 = d1;
        // ListNode t2 = d2;
        // ListNode t = head;
        // int count = 1;
        // while(t!=null){
        //     if(count%2!=0){
        //         t1.next = t;
        //         t1 = t1.next;
        //     }
        //     else{
        //         t2.next = t;
        //         t2 = t2.next;
        //     }
        //     t = t.next;
        //     count++;
        // }
        // t1.next = null;
        // t2.next = null;
        // t1 = d1.next;
        // t2 = d2.next;
        // t = d1;
        // count = 1;
        // while(t2!=null){
        //     if(count%2!=0){
        //         t.next = t2;
        //         t2 = t2.next;
        //     }
        //     else{
        //         t.next = t1;
        //         t1 = t1.next;
        //     }
        //     t = t.next;
        //     count++;
        // }
        // if(t1!=null) t.next = t1;
        // return d1.next;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while(pre.next!=null && pre.next.next!=null){
            ListNode first = pre.next;
            ListNode second = pre.next.next;
            first.next = second.next;
            second.next = first;
            pre.next = second;
            pre = first;
        }
        return dummy.next;
    }
}