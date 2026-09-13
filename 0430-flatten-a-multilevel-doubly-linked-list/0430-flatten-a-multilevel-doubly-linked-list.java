class Solution {
    public Node findTail(Node head){
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        return tail;
    }
    public Node flatten(Node head) {
        Node t = head;
        while(t!=null){
            if(t.child!=null){
                Node head2 = flatten(t.child);
                if(t.next==null){
                    t.next = head2;
                    head2.prev = t;
                    t.child = null;
                }else{
                    Node t2 = t.next;
                    head2.prev = t;
                    t.next = head2;
                    Node tail = findTail(head2);
                    t2.prev = tail;
                    tail.next = t2;
                    t.child = null;
                }
            }
            t = t.next;
        }
        return head;
    }
}