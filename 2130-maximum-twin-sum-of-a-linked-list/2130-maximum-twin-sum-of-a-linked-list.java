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
    public ListNode reverse(ListNode head){
        if(head==null || head.next == null) return head;
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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode i = head;
        ListNode j = head2;
        int sum = -1;
        while(i!=null && j!=null){
            if(sum<i.val+j.val) sum = i.val+j.val;
            i = i.next;
            j = j.next;
        }
        return sum;
    }
}