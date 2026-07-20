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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(0);
        ListNode currM = merged;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                currM.next = list2;
                list2 = list2.next;
            } else {
                currM.next = list1;
                list1 = list1.next;
            }
            currM = currM.next;
        }
        
        if (list1 != null) {
            currM.next = list1;
        } else {
            currM.next = list2;
        }

        return merged.next;
    }
}