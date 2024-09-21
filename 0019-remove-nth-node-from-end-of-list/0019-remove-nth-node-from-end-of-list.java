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
        if(head==null)
            return head;
        int len=0;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr_node=dummy;
        while(curr_node!=null){
            len++;
            curr_node=curr_node.next;
        }
        curr_node=dummy;
        for(int i=1;i<len-n;i++){
            curr_node=curr_node.next;
        }
        curr_node.next=curr_node.next.next;
        return dummy.next;
    }
}