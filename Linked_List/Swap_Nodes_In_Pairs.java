/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode prev = head;
        ListNode newHead = head.next;
        ListNode second = head.next;
        head.next = head.next.next;
        second.next = head;
        head = head.next;
        
        while (head != null && head.next != null) {
            second = head.next;
            head.next = head.next.next;
            second.next = head;
            prev.next = second;
            prev = head;
            head = head.next;
        }
        
        return newHead;
    }
}
