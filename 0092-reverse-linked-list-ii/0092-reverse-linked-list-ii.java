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
        if(head==null || left==right)
            return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevLeft=dummy;
        ListNode curr_node=head;
        for(int i=0;i<left-1;i++){
            prevLeft=prevLeft.next;
            curr_node=curr_node.next;
        }
        ListNode prevNode=null;
        ListNode subListHead=curr_node;
        for(int i=0;i<right-left+1;i++){
            ListNode next_node=curr_node.next;
            curr_node.next=prevNode;
            prevNode=curr_node;
            curr_node=next_node;
        }
        prevLeft.next=prevNode;
        subListHead.next=curr_node;
        return dummy.next;
    }
}