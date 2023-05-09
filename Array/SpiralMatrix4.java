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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int top=0, left=0, bottom=m-1, right=n-1;
        int arr[][] = new int[m][n];
        for(int[] row: arr)   Arrays.fill(row,-1);
        while(top<=bottom && left<=right && head!=null){    
            for(int i=left;i<=right && head!=null;i++){
                arr[top][i] = head.val;
                head = head.next;
                
            }
            top++;
            for(int i=top;i<=bottom && head!=null;i++){
                arr[i][right] = head.val;
                head = head.next;
                
            }
            right--;
            for(int i=right;i>=left && head!=null;i--){
                arr[bottom][i] = head.val;
                head = head.next;
                
            }
            bottom--;
            for(int i=bottom;i>=top && head!=null;i--){
                
                arr[i][left] = head.val;
                head = head.next;
                
            }
            left++;
        }
        return arr;
    }
}