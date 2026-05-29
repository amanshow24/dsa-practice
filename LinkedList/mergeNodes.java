// 2181. Merge Nodes in Between Zeros
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next ;
        ListNode t = head ;
        int value = 0 ;

        while(temp != null){
            if(temp.val != 0){
               value += temp.val ;
            } else {
               ListNode newNode = new ListNode(value) ;
               t.next = newNode ;
               t = t.next ;
               value = 0 ;
            }
            temp = temp.next ;  
        }

        return head.next ;
    }
}
