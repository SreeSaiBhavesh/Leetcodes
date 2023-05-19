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
    public int pairSum(ListNode head) {
        int maxSum = 0;
        ListNode midptr = head;
        ListNode endptr = head;
        ListNode prevptr = null;
        while(endptr!=null && endptr.next!=null){
            endptr = endptr.next.next;
            ListNode nextptr = midptr.next;
            midptr.next = prevptr;
            prevptr = midptr;
            midptr = nextptr; 
        }
        if(endptr!=null){
            maxSum = midptr.val;
            midptr = midptr.next;
        }
        while(midptr!=null){
            maxSum = Math.max(maxSum, midptr.val+prevptr.val);
            midptr = midptr.next;
            prevptr = prevptr.next;
        }
        return maxSum;
    }
}