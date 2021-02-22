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
    public ListNode mergeKLists(ListNode[] lists) {
     int len=lists.length;
        ArrayList l=new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            ListNode p=lists[i];
            while(p!=null)
            {
                l.add(p.val);
                p=p.next;
            }
        }
        Collections.sort(l);
        ListNode head=new ListNode(0);
        ListNode curr=head;
        int size=l.size();
        for(int i=0;i<size;i++)
        {
            int val=(int)l.get(i);
            curr.next=new ListNode(val);
            curr=curr.next;
        }
        return head.next;
    }
}
