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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0 || head.next==null)
            return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr_node=head;
        int len=0;
        while(curr_node!=null){
            len++;
            curr_node=curr_node.next;
        }
        if(k==len)
            return head;
        if(k>len){
            k=k%len;
        }
        if(k==0)
            return head;
        System.out.println(k);
        curr_node=dummy;
        for(int i=0;i<len-k;i++){
            curr_node=curr_node.next;
        }
        ListNode tailStart=curr_node.next;
        ListNode currTail=tailStart;
        curr_node.next=null;
        while(currTail.next!=null){
            currTail=currTail.next;
        }
        currTail.next=head;
        dummy.next=tailStart;
        return dummy.next;
    }
}