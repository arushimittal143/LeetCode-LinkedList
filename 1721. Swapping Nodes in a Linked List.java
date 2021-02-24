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
       ListNode curr1=head;
        ListNode curr2=head;
        ListNode curr=head;
        int K=k-1;
        while(K-->0)
        {
            curr1=curr1.next;
            curr=curr.next;
        }
       // System.out.println(curr1.val);
         while(curr.next != null){
        curr2 = curr2.next;
        curr = curr.next;
    }
    
       //System.out.println(curr2.val);
        int temp=curr1.val;
        curr1.val=curr2.val;
        curr2.val=temp;
        
        return head;
    }
}
