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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next==null) return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = null;
        for(int i=1;i<=k;i++){
            temp = fast;
            fast = fast.next;
        }
        int i=1;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        int dummy = temp.val;
        temp.val = slow.val;
        slow.val = dummy;
        return head;
    }
}