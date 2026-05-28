// 2807. Insert Greatest Common Divisors in Linked List
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head ;
        while(temp.next != null){
            int a = temp.val ;
            int b = temp.next.val ;

            int gcdVal = gcd (a , b) ;
            ListNode gcdNode = new ListNode(gcdVal) ;
           
            // make connection with new gcd node
            gcdNode.next = temp.next ;
            temp.next = gcdNode ;

            temp = temp.next.next ;
        }
        return head ;
       
    }
    public static int gcd (int a , int b){
        while(b != 0){
            int temp = a ;
            a = b ;
            b = temp % b ;
        }
        return a ;
    }
}
