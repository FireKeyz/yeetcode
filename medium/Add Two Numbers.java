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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentNode = new ListNode(0);
        ListNode rootNode = currentNode;
        ListNode prevNode = currentNode;
        int carryover = 0;
        while(l1 != null && l2 != null) {
            int sum = (l1.val + l2.val + carryover);
            currentNode.val = sum%10;
            currentNode.next = new ListNode(0);
            prevNode = currentNode;
            currentNode = currentNode.next;
            carryover = 0;
            if(sum >= 10) carryover = 1;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int sum = (l1.val + carryover);
            currentNode.val = sum%10;
            currentNode.next = new ListNode(0);
            prevNode = currentNode;
            currentNode = currentNode.next;
            carryover = 0;
            if(sum >= 10) carryover = 1;
            l1 = l1.next;
        }
        while(l2 != null) {
            int sum = (l2.val + carryover);
            currentNode.val = sum%10;
            currentNode.next = new ListNode(0);
            prevNode = currentNode;
            currentNode = currentNode.next;
            carryover = 0;
            if(sum >= 10) carryover = 1;
            l2 = l2.next;
        }
        if(carryover == 1) {
            currentNode.val = 1;
        } else {
            prevNode.next = null;
        }
        return rootNode;
    }
}