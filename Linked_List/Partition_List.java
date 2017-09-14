/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lesshead = null;
        ListNode morehead = null;
        ListNode more = null;
        ListNode less = null;

        while (head != null) {
            if (head.val >= x) {
                if (morehead != null) {
                    more.next = head;
                    more = more.next;
                    head = head.next;
                } else {
                    more = head;
                    morehead = head;
                    head = head.next;
                }
            } else {
                if (lesshead != null) {
                    less.next = head;
                    less = less.next;
                    head = head.next;
                } else {
                    lesshead = head;
                    less = head;
                    head = head.next;
                }
                
            }
        }
        
        if (more != null) more.next = null;
        if (less != null) less.next = morehead;
        if (lesshead == null) return morehead;
        else return lesshead;
    }
}
