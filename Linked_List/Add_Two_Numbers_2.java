/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private ListNode reverseLN(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode rl1 = reverseLN(l1);
        ListNode rl2 = reverseLN(l2);
            
        int mod = (rl1.val + rl2.val) % 10;
        int div = (rl1.val + rl2.val) / 10;
        ListNode newl = new ListNode(mod);
        ListNode head = newl;
        
        int temp1 = 0;
        int temp2 = 0;
        while (rl1.next != null || rl2.next != null) {
            if (rl1.next != null) {
                rl1 = rl1.next;
                temp1 = rl1.val;
            } else {
                temp1 = 0;
            }
            if (rl2.next != null) {
                rl2 = rl2.next;
                temp2 = rl2.val;
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
        
        return reverseLN(head);
    }
}
