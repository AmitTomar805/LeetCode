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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode temp=head.next.next;
        ListNode temphead=head;
        head=head.next;
        head.next=temphead;
        head.next.next=temp;
        ListNode tempvar=head.next;
        while(tempvar.next!=null && tempvar.next.next!=null){
            ListNode tLastPointer=tempvar.next.next.next;
            ListNode thead=tempvar.next;
            tempvar.next=tempvar.next.next;
            tempvar.next.next=thead;
            tempvar.next.next.next=tLastPointer;
            tempvar=tempvar.next.next;
        }
        return head;
    }
}