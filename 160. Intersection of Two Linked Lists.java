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
        HashSet<ListNode> s=new HashSet<>();
        ListNode curr=headA;
        while(curr!=null)
        {
            s.add(curr);
            curr=curr.next;
        }
        curr=headB;
        while(curr!=null)
        {
            if(s.contains(curr))
            {
                break;
            }
            else
                curr=curr.next;
        }
        return curr;
    }
}
