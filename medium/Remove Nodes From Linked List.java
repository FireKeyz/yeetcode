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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> mono = new Stack<>();
        mono.push(head.val);
        ListNode curr = head.next;
        while(curr != null) {
            while(!mono.isEmpty() && mono.peek() < curr.val) {
                mono.pop();
            }
            mono.push(curr.val);
            curr = curr.next;
        }

        ListNode top = null;
        while (!mono.isEmpty()) {
            ListNode newNode = new ListNode(mono.pop());
            newNode.next = top;
            top = newNode;
        }
        return top;

    }
}