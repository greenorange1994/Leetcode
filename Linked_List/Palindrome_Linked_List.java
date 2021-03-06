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
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        
        return prev;
    }
    
    private ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode mid = findMiddle(head);
        mid.next = reverseLN(mid.next);
        ListNode p1 = head;
        ListNode p2 = mid.next;
        while(p2 != null && p1.val == p2.val){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2 == null;
    }
}
