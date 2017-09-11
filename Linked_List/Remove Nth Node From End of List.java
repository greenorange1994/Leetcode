/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private ListNode reverse(ListNode head) {
        ListNode prev =null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
     
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode rhead = reverse(head);
        ListNode rec = rhead;
        int count = 1;
        
        if (n == 1) {
            return reverse(rec.next);
        }
        
        while (rhead != null) {
            count += 1;
            if (count == n) {
                if (rhead.next != null) rhead.next = rhead.next.next;
                break;
            }
            rhead = rhead.next;
        }
        return reverse(rec);
    }
}
