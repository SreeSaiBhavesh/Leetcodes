/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hset = new HashSet<>();
        while(head != null){
            
            if(hset.contains(head)){
                return true;
            }
            hset.add(head);
            head = head.next;
        }
        return false;
    }
}