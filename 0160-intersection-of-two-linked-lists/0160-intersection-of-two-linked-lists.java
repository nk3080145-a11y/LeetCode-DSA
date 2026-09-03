/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode temp = headA;
        while(temp!=null){
            temp = temp.next;
            lenA++;
        }
        temp = headB;
        while(temp!=null){
            temp = temp.next;
            lenB++;
        }
        int diff = 0;
        ListNode temp2 = headA;
        if(lenA<lenB) {
            diff = lenB-lenA;
            temp = headB;
            temp2 = headA;
        }
        else {
            diff = lenA - lenB;
            temp = headA;
            temp2 = headB;
        }
        for(int i=1;i<=diff;i++){
            temp = temp.next;
        }
        while(temp!=null && temp2!=null){
            if(temp==temp2) return temp;
            temp = temp.next;
            temp2 = temp2.next;
        }
        return null;
    }
}