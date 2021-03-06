/**
 * My solution to https://leetcode.com/problems/add-two-numbers/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nh = new ListNode(0);
        ListNode l = nh;
        int carry = 0;
        while ( l1 != null || l2 != null ) {
            int n = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = n / 10;
            n = n % 10;
            l.next = new ListNode(n);
            l = l.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if ( carry > 0 ) {
            l.next = new ListNode(carry);
        }
        return nh.next;
    }
}
