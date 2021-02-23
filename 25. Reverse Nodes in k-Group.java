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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || size(head)<k)
            return head;
            
        ListNode curr=head;
        ListNode first=head;
        ListNode next=null;
        ListNode prev=null;
        int val=k;
        while(val>0)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            val--;
        }
       first.next=reverseKGroup(next,k);
        return prev;
    }
    public int size(ListNode head)
    {
        int res=0;
        while(head!=null)
        {
            res++;
            head=head.next;
        }
        return res;
    }
}
