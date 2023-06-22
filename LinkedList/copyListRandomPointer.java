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
        Node temp = head;

        while(temp != null){
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        Node itr = head;
        while(itr != null){
            if(itr.random != null)
                itr.next.random = itr.random.next;
            itr = itr.next.next;
        }

        Node dummy = new Node(0);
        itr = head;
        temp = dummy;
        Node fast;
        while(itr != null){
            fast = itr.next.next;
            temp.next = itr.next;
            itr.next = fast;
            temp = temp.next;
            itr = fast;
        }
        return dummy.next;
    }
}