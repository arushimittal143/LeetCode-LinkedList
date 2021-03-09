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
    public ListNode sortList(ListNode head) {
     ArrayList<Integer> s=new ArrayList<Integer>();
        ListNode curr=head;
        while(curr!=null)
        {
            s.add(curr.val);
            curr=curr.next;
        }
         Collections.sort(s); 
        curr=head;
        int i=0;
       while(curr!=null)
       {
           curr.val=s.get(i);
           curr=curr.next;
           i++;
       }
        return head;
    }
}
