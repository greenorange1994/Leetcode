/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        /* iterative solution */
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode first = head;
        ListNode mPrevious = null;
        ListNode temp = null;
        int flag = 1;
        while(head != null && flag < m){
            if (flag == m-1) mPrevious = head;
            head = head.next;
            flag = flag + 1;
        }
        ListNode reverseHead = head;
        while(head != null && flag < n){
            head = head.next;
            flag = flag + 1;
        }
        if (head.next != null) {
            temp = head.next;
            head.next = null;
        }
        ListNode reversefirst = reverseList(reverseHead);
        ListNode reverse = reversefirst;
        if (mPrevious != null) mPrevious.next = reversefirst;
        while(reversefirst.next != null){
            reversefirst = reversefirst.next;
        }
        reversefirst.next = temp;
        if (m == 1) return reverse;
        else return first;
    }
}
