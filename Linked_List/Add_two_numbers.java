/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
            
        int mod = (l1.val + l2.val) % 10;
        int div = (l1.val + l2.val) / 10;
        ListNode newl = new ListNode(mod);
        ListNode head = newl;
        
        int temp1 = 0;
        int temp2 = 0;
        while (l1.next != null || l2.next != null) {
            if (l1.next != null) {
                l1 = l1.next;
                temp1 = l1.val;
            } else {
                temp1 = 0;
            }
            if (l2.next != null) {
                l2 = l2.next;
                temp2 = l2.val;
            } else {
                temp2 = 0;
            }
            mod = (temp1 + temp2 + div) % 10;
            newl.next = new ListNode(mod);
            div = (temp1 + temp2 + div) / 10;
            newl = newl.next;
        }
        if (div > 0) {
            newl.next = new ListNode(div);
            newl = newl.next;
        }
        
        return head;
    }
}
