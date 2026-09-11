class Solution {
    public ListNode merge(ListNode h1,ListNode h2){
        ListNode t1 = h1;
        ListNode t2 = h2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        if(t1==null){
            temp.next = t2;
        }else{
            temp.next = t1;
        }
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ArrayList<ListNode> list1 = new ArrayList<>();
        ArrayList<ListNode> list2 = new ArrayList<>();
        for(ListNode node : lists) list1.add(node);
        while(list1.size()+list2.size()>1){
            while(list1.size()!=0){
                if(list1.size()==1){
                    list2.add(list1.get(0));
                    list1.remove(0);
                    break;
                }
                ListNode a = list1.get(list1.size()-1);
                list1.remove(list1.size()-1);
                ListNode b = list1.get(list1.size()-1);
                list1.remove(list1.size()-1);
                list2.add(merge(a,b));
            }
            while(list2.size()!=0){
                if(list2.size()==1){
                    list1.add(list2.get(0));
                    list2.remove(0);
                    break;
                }
                ListNode a = list2.get(list2.size()-1);
                list2.remove(list2.size()-1);
                ListNode b = list2.get(list2.size()-1);
                list2.remove(list2.size()-1);
                list1.add(merge(a,b));
            }
        }
        if(list1.size()==1) return list1.get(0);
        else return list2.get(0);
    }
}