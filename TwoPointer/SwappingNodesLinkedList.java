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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode leftnode = head, rightnode = head;
        for(int i=1;i<k;i++){
            rightnode = rightnode.next;
        }
        ListNode current = rightnode;
        while(current.next!=null){
            current = current.next;
            leftnode = leftnode.next;
        }
        int temp = rightnode.val;
        rightnode.val = leftnode.val;
        leftnode.val = temp;

        return head;

    }
}