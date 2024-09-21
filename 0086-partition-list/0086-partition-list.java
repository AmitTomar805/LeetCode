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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)
            return head;
        ListNode dummyLeft=new ListNode();
        ListNode dummyRight=new ListNode();
        ListNode left=dummyLeft;
        ListNode right=dummyRight;
        while(head!=null){
            if(head.val<x){
                left.next=head;
                left=left.next;
            }
            else{
                right.next=head;
                right=right.next;
            }
            head=head.next;
        }
        left.next=dummyRight.next;
        right.next=null;
        return dummyLeft.next;
    }
}