// 1290. Convert Binary Number in a Linked List to Integer
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
    public int getDecimalValue(ListNode head) {
        ListNode curr = head ;
        ListNode prev = null ;
        ListNode fwd = null ;

        while(curr != null){
            fwd = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = fwd ;
        }
        // now linkedlist is reversed & prev became head ;
        int ans = 0 ;
        int i = 0 ;
        while(prev != null){
            ans += (prev.val) * (int) Math.pow(2,i) ;
            i++ ;

            prev = prev.next ;
        }
        return ans ;
    }
}
