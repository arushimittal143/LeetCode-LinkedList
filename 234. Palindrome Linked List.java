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
    public boolean isPalindrome(ListNode head) {
         Stack<Integer> s=new Stack<Integer>();
        for(ListNode curr=head;curr!=null;curr=curr.next)
        {
            s.push(curr.val);
        }
         for(ListNode curr=head;curr!=null;curr=curr.next)
        {
            if(s.pop()!=curr.val)
            return false;
        }
    return true;
    }
}
