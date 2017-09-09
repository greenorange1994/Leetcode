public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        int temp1 = l1.val;
        int temp2 = l2.val;
        ListNode newl;
        if (temp1 < temp2) {
            newl = new ListNode(temp1);
            l1 = l1.next;
        } else {
            newl = new ListNode(temp2);
            l2 = l2.next;
        }
        ListNode head = newl;
        
        while (l1 != null || l2 != null) {
            if (l1 != null) temp1 = l1.val;
            else temp1 = Integer.MAX_VALUE;
            if (l2 != null) temp2 = l2.val;
            else temp2 = Integer.MAX_VALUE;
            if (temp1 < temp2) {
                newl.next = new ListNode(temp1);
                l1 = l1.next;
            } else {
                newl.next = new ListNode(temp2);
                l2 = l2.next;
            }
            newl = newl.next;
        }
        return head;
    }
} 
