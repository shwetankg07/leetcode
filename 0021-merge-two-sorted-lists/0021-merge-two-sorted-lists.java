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
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode temp1 = A;
        ListNode temp2 = B;
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                ans.next = temp1;
                temp1 = temp1.next;
            } else {
                ans.next = temp2;
                temp2 = temp2.next;
            }
            ans = ans.next;
        }
        if (temp1 != null) {
            ans.next = temp1;
        } else {
            ans.next = temp2;
        }

        return dummy.next; 
    }
}