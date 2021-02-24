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
    public ListNode middleNode(ListNode head) {
        
        if(head==null)
            return null;
        //M-1 with iterative
        ListNode curr;
        int c=0;
        for(curr=head;curr!=null;curr=curr.next)
            c++;
        curr=head;
        for(int i=0;i<c/2;i++)
            curr=curr.next;
        return curr;
        
        //M2 with pointers
        // ListNode slow=head,fast=head;
        // while(fast!=null && fast.next!=null)
        // {
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // return slow;
    }
}
