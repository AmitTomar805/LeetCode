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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1=l1;
        ListNode h2=l2;
        int carry=0;
        ListNode r=new ListNode();
        ListNode tail=r;
        while(h1!=null && h2!=null){
            int v=h1.val+h2.val+carry;
            tail.next=new ListNode(v%10);
            carry=v/10;
            h1=h1.next;
            h2=h2.next;
            tail=tail.next;
        }
        while(h1!=null){
            int v=h1.val+carry;
            tail.next=new ListNode(v%10);
            carry=v/10;
            h1=h1.next;
            tail=tail.next;
        }
        while(h2!=null){
            int v=h2.val+carry;
            tail.next=new ListNode(v%10);
            carry=v/10;
            h2=h2.next;
            tail=tail.next;
        }
        if(carry>0)
            tail.next=new ListNode(carry);
        return r.next;
    }
}