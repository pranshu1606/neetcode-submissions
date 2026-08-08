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
        if(list1==null&&list2==null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        //counting the length of list1
        ListNode temp1 = list1;
        int count1 =0;
        while(temp1!=null){
            count1++;
            list.add(temp1.val);
            temp1=temp1.next;
        }
        //counting the length of list2
        ListNode temp2 = list2;
        int count2=0;
        while(temp2!=null){
            count2++;
            list.add(temp2.val);
            temp2=temp2.next;
        }
        Collections.sort(list);
        ListNode head = new ListNode(list.get(0));
        ListNode n;
        ListNode temp = head;
        for(int i=1;i<list.size();i++){
            n=new ListNode(list.get(i));
            temp.next = n;
            temp = n;
        }
        return head;
    }
}