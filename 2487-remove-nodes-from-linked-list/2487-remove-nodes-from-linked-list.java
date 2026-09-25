class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        Stack<ListNode> st = new Stack<>();
        while(temp!=null){
            while(st.size()>0 && temp.val>st.peek().val) st.pop();
            st.push(temp);
            temp = temp.next;
        }
        temp = null;
        while(st.size()!=0){
            ListNode t = st.pop();
            t.next = temp;
            temp = t;
        }
        return temp;
    }
}