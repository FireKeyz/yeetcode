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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1) {
            return null;
        }
        Map<Integer, ListNode> mappy = new HashMap<>();
        int index = 1;
        ListNode curr = head;
        mappy.put(1, curr);
        while(curr.next != null) {
            curr = curr.next;
            index++;
            mappy.put(index, curr);
        }
        int left = index - n;
        int right = index - n + 2;
        if(left == 0) head = head.next;
        else {mappy.get(left).next = mappy.get(right);}
        return head;
    }
}