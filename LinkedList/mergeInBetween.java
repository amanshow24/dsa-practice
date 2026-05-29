// 1669. Merge In Between Linked Lists
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1 ;

        for(int i = 1 ; i < a ; i++){
            temp = temp.next ;
        }
        ListNode x = temp ;

        for(int i = 1 ; i <= b - a + 1 ; i++){
            temp = temp.next ;
        }
        ListNode y = temp.next ;

        ListNode temp2 = list2 ;
        while(temp2.next != null){
            temp2 = temp2.next ;
        }

        // Merge
        x.next = list2 ;
        temp2.next = y ;

        return list1 ;
    }
}
