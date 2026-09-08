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
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode pre = null;
        ListNode t1 = head;
        ListNode t2 = head.next;
        while(t2!=null){
            t1.next = pre;
            pre = t1;
            t1 = t2;
            t2 = t2.next;
        }
        t1.next = pre;
        return t1;
    }
}