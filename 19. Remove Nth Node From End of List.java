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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
    int count = 0;
    while(temp != null){
    temp = temp.next;
    count++;
    }
    count -= n;
    temp = head;
    if(count > 0){
    for(int i = 1; i< count; i++){
    temp = temp.next;
    }
    temp.next = temp.next.next;
    }
    else if(count == 0)
    head = head.next;
    return head;
    }
}
