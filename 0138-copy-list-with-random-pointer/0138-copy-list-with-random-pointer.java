/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> m=new HashMap<>();
        Node curr=head;
        while(curr!=null){
            Node copy=new Node(curr.val);
            m.put(curr,copy);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            Node copy=m.get(curr);
            copy.next=m.get(curr.next);
            copy.random=m.get(curr.random);
            curr=curr.next;
        }
        return m.get(head);
    }
}