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
        if (head == null) return null;

        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int removeIndex = list.size() - n;
        list.remove(removeIndex); 
        if (list.isEmpty()) {
            return null;
        }
        ListNode head1 = new ListNode(list.get(0));
        ListNode temp1 = head1;
        for (int i = 1; i < list.size(); i++) {
            ListNode k = new ListNode(list.get(i));
            temp1.next = k;
            temp1 = k;
        }
        return head1;
    }
}
