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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr_node=dummy;
        Boolean remove=false;
        while(curr_node.next!=null && curr_node.next.next!=null){
            if(curr_node.next.val==curr_node.next.next.val){
                curr_node.next=curr_node.next.next;
                remove=true;
            }
            else{
                if(remove){
                    curr_node.next=curr_node.next.next;
                    remove=false;
                    continue;
                }
                curr_node=curr_node.next;
            }
        }
        if(remove){
            curr_node.next=curr_node.next.next;
        }
        return dummy.next;
    }
}