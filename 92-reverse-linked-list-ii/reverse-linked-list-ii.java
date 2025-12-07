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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode curr = head;
        ListNode preleft = dummyNode;

        for(int i=0; i<left-1; i++){
            preleft = preleft.next;
            curr = curr.next;
        }

        ListNode sublisthead = curr;
        ListNode preNode = null;
        for(int i=0; i<=right-left; i++){
            ListNode nextNode = curr.next;
            curr.next = preNode;
            preNode = curr;
            curr = nextNode;
        }
        preleft.next = preNode;
        sublisthead.next = curr;

        return dummyNode.next;
    }
}