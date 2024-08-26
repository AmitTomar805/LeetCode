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
        ListNode res=new ListNode(0);
        ListNode dummyHead=res;
        ListNode h1=list1;
        ListNode h2=list2;
        while(h1!=null && h2!=null){
            if(h1.val<h2.val){
                dummyHead.next=new ListNode(h1.val);
                h1=h1.next;
            }
            else if(h1.val>h2.val){
                dummyHead.next=new ListNode(h2.val);
                h2=h2.next;
            }
            else{
                dummyHead.next=new ListNode(h1.val);
                dummyHead=dummyHead.next;
                dummyHead.next=new ListNode(h2.val);
                h1=h1.next;
                h2=h2.next;
            }
            dummyHead=dummyHead.next;
        }
        while(h1!=null){
            dummyHead.next=new ListNode(h1.val);
            h1=h1.next;
            dummyHead=dummyHead.next;
        }
        while(h2!=null){
            dummyHead.next=new ListNode(h2.val);
            h2=h2.next;
            dummyHead=dummyHead.next;
        }
        return res.next;
    }
}