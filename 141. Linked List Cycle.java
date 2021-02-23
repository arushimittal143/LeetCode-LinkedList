/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
   HashSet<ListNode> s=new HashSet<ListNode>();
    ListNode curr=head;
    for(curr=head;curr!=null;curr=curr.next)
    {
        if(s.contains(curr)){
            return true;
        }
        else
        s.add(curr);
    }
	 return false;
    }
}
