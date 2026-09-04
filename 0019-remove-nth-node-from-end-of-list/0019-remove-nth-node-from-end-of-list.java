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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            head = null;
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        Boolean flag = false;
        for(int i=1;i<=n+1;i++){
            if(fast==null){
                flag = true;
                break;
            }
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        if(flag==true){
            slow = slow.next;
            head = slow;
        }
        else slow.next = slow.next.next;
        return head;
    }
}