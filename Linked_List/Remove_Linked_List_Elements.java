/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode first = head;
        
        while (head != null) {
            if (head.val == val) {
                if (prev != null) {
                    prev.next = head.next;
                    head.next = null;
                    head = prev.next;
                } else {
                    first = head.next;
                    head.next = null;
                    head = first;
                }
            } else {
                prev = head;
                head = head.next;
            }
        }
        
        return first;
    }
}
