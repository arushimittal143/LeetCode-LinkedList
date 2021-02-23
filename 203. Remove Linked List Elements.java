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
    public ListNode removeElements(ListNode head,int x) {
        if(head==null)
            return null;
        if(head.next==null)
        {
            if(head.val==x)
            {
                return null;
            }
            else
            {
            return head;    
            }
        }
        while(head.val==x && head.next!=null)
        {
            head=head.next;
        }
        if(head.next==null && head.val==x)
        {
            return null;
        }
        ListNode curr=head;
            while(curr.next!=null)
        {
            if(curr.next.val==x)
            {
                curr.next=curr.next.next;
            }
            else
            {
                curr=curr.next;
            }
        }
        return head;
    }
}
